package com.assign.ordersale.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.ordersale.dto.OrderDTO;
import com.assign.ordersale.entity.OrderEntity;
import com.assign.ordersale.repository.OrderRepos;

@Service
public class OrderService {
	@Autowired
	OrderRepos orderRepo;
	public List<OrderDTO> getorders() {
		List<OrderEntity> ord=orderRepo.findAll();
		List<OrderDTO> orddto=new ArrayList<OrderDTO>();
		for(OrderEntity order: ord) {
		OrderDTO ordee=OrderDTO.valueOf(order);
		orddto.add(ordee);
		}
		return orddto;
	}

	public Object saveOrders(OrderEntity order) {
		return orderRepo.save(order);
			
	}
	public void deleteorderdet(Integer orderid)   
	{  
	orderRepo.deleteById(orderid);  
	}  
}

