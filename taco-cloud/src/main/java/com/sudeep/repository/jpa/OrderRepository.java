package com.sudeep.repository.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.sudeep.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

	List<Order> findByZip(String zip);

	List<Order> readOrdersByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);

	@Query("Order o where o.city='Mumbai'")
	List<Order> readOrderDeliveredInMumbai();

}
