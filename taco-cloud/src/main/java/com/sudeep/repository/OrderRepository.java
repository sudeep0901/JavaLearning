package com.sudeep.repository;

import com.sudeep.domain.Order;

public interface OrderRepository {
	Order save(Order order);
}
