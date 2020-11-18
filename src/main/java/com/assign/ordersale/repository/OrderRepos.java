package com.assign.ordersale.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assign.ordersale.dto.OrderDTO;
import com.assign.ordersale.entity.OrderEntity;

@Repository
@Transactional
public interface OrderRepos extends JpaRepository<OrderEntity,Integer> {
	Object save(OrderDTO orders);
	

}
