package com.sudeep.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sudeep.domain.Ingredient;
import com.sudeep.repository.IngredientRepository;

@Repository
public class JdbcIntegradientRepository implements IngredientRepository {

	private JdbcTemplate jdbc;

	@Autowired
	public JdbcIntegradientRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public Iterable<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return jdbc.query("select id, name, type from Ingredient", this::mapRowToIngredient);
	}

	@Override
	public Ingredient findOne(String id) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject("select id, name, type from Ingredient where id=?", this::mapRowToIngredient, id);
	}

	@Override
	public Ingredient save(Ingredient ingredient) {
		// TODO Auto-generated method stub

		jdbc.update("insert into Ingredient(id, name, type) values (? ,? ,?)", ingredient.getId(), ingredient.getName(),
				ingredient.getType().toString());
		return ingredient;
	}

	Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
		System.err.println("Number of rows: " + rowNum);
		return new Ingredient(rs.getString("id"), rs.getString("name"), Ingredient.Type.valueOf(rs.getString("type")));

	}

	public Ingredient findOnee(String id) {
		return jdbc.queryForObject("select id, name, type from Ingredient where id=?", new RowMapper<Ingredient>() {
			public Ingredient mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Ingredient(rs.getString("id"), rs.getString("name"),
						Ingredient.Type.valueOf(rs.getString("type")));
			};
		}, id);
	}
}
