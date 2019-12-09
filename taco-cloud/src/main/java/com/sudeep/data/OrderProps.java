package com.sudeep.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "taco-order")
@Data
public class OrderProps {

	private int pageSize = 20;	
}
