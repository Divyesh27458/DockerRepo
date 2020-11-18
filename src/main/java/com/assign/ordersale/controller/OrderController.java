package com.assign.ordersale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assign.ordersale.dto.OrderDTO;
import com.assign.ordersale.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	
	
	@GetMapping(value="/orders" ,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDTO> getorders(){
		List<OrderDTO> od=orderService.getorders();
		return od;
    }
	
    @PostMapping(value="/neworder", consumes  = MediaType.APPLICATION_JSON_VALUE)
    public String addOrders(@RequestBody OrderDTO orders) {
    	orderService.saveOrders(orders.createEntity());
    	return "Order Confirmed" + ": "+ orders.getOrderid();
    	
    }
    @DeleteMapping(value="/dlorder/{orderid}")
    public String deleteOrder(@PathVariable Integer orderid) {
    	orderService.deleteorderdet(orderid);
    	return "OrderDeleted Successfully";
    }
    


	
}
