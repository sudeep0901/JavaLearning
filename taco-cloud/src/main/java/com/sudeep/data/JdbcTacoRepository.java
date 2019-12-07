package com.sudeep.data;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sudeep.domain.Taco;
import com.sudeep.repository.TacoRepository;

@Repository
public class JdbcTacoRepository implements TacoRepository {

	private JdbcTemplate jdbc;

	public JdbcTacoRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public Taco save(Taco taco) {
		// TODO Auto-generated method stub
		long tacoId = saveTacoInfo(taco);
		taco.setId(tacoId);
		for (String ingr : taco.getIngredients()) {
			saveIngredientToTaco(ingr, tacoId);
		}
		return taco;
	}

	private void saveIngredientToTaco(String ingr, long tacoId) {
		// TODO Auto-generated method stub
		jdbc.update("insert into Taco_Ingredients (taco, ingredient) " + "values (?, ?)", tacoId, ingr);
	}

	private long saveTacoInfo(Taco taco) {
		// TODO Auto-generated method stub
		KeyHolder keyHolder = new GeneratedKeyHolder();

		try {
			taco.setCreatedAt(new Date());
			PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(
					"insert into Taco (name, createdAt) values (?, ?)", Types.VARCHAR, Types.TIMESTAMP);
			pscf.setReturnGeneratedKeys(true);

			PreparedStatementCreator psc = pscf.newPreparedStatementCreator(
					Arrays.asList(taco.getName(), new Timestamp(taco.getCreatedAt().getTime())));

			jdbc.update(psc, keyHolder);
		} catch (DataAccessException e) {

			System.err.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}

		return keyHolder.getKey().longValue();

	}

}
