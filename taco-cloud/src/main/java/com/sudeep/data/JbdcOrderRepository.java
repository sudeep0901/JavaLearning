package com.sudeep.data;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sudeep.domain.Order;
import com.sudeep.domain.Taco;
import com.sudeep.repository.OrderRepository;
import com.sudeep.security.User;

@Repository
public class JbdcOrderRepository implements OrderRepository {

	private SimpleJdbcInsert orderInserter;
	private SimpleJdbcInsert orderTacoInserter;
	private ObjectMapper objectMapper;

	public JbdcOrderRepository(JdbcTemplate jdbc) {
		this.orderInserter = new SimpleJdbcInsert(jdbc).withTableName("Taco_Order").usingGeneratedKeyColumns("id");
		this.orderTacoInserter = new SimpleJdbcInsert(jdbc).withTableName("Taco_Orders_Tacos");

		this.objectMapper = new ObjectMapper();

	}

	@Override
	public Order save(Order order) {
		order.setPlacedAt(new Date());
		long orderId = saveOrderDetails(order);
		order.setId(orderId);
		List<Taco> tacos = order.getTacos();

		for (Taco taco : tacos) {
			savaTacoToOrder(taco, orderId);

		}
		// TODO Auto-generated method stub
		return null;
	}

	private void savaTacoToOrder(Taco taco, long orderId) {
		// TODO Auto-generated method stub
		Map<String, Object> values = new HashMap<>();
		values.put("tacoOrder", orderId);
		values.put("taco", taco.getId());
		orderTacoInserter.execute(values);

	}

	private long saveOrderDetails(Order order) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unchecked")
		Map<String, Object> values = objectMapper.convertValue(order, Map.class);
		values.put("placedAt", order.getPlacedAt());
		System.err.println(values);
		long orderId = orderInserter.executeAndReturnKey(values).longValue();
		return orderId;

	}

	 

}
