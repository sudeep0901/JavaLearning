package com.sudeep.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sudeep.domain.Order;
import com.sudeep.security.User;

public interface OrderRepository {
	Order save(Order order);
//	List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
