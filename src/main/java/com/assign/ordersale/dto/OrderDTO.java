package com.assign.ordersale.dto;

import com.assign.ordersale.entity.OrderEntity;
import com.assign.ordersale.model.Order;

public class OrderDTO {
	private Integer orderid;
	private String customer_id;
	private String customer_name;
	private String customer_email;
	private String customer_phone;
	private String item_id;
	private Integer item_price;
	private Integer quantity;
	private Integer pincode;
	private String doorno;
	private String city;
	private String locality;
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public Integer getItem_price() {
		return item_price;
	}
	public void setItem_price(Integer item_price) {
		this.item_price = item_price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public static OrderDTO valueOf(OrderEntity order) {
		OrderDTO orderDTO= new OrderDTO();
		orderDTO.setCustomer_id(order.getCustomer_id());
		orderDTO.setCustomer_email(order.getCustomer_email());
		orderDTO.setCustomer_name(order.getCustomer_name());
		orderDTO.setCustomer_phone(order.getCustomer_phone());
		orderDTO.setItem_id(order.getItem_id());
		orderDTO.setItem_price(order.getItem_price());
		orderDTO.setOrderid(order.getOrderid());
		orderDTO.setCity(order.getCity());
		orderDTO.setPincode(order.getPincode());
		orderDTO.setLocality(order.getLocality());
		orderDTO.setQuantity(order.getQuantity());
		orderDTO.setDoorno(order.getDoorno());
		return orderDTO;
	}
	public OrderEntity createEntity() {
		OrderEntity be=new OrderEntity();
		be.setCustomer_id(this.getCustomer_id());
		be.setCustomer_email(this.getCustomer_email());
		be.setCustomer_name(this.getCustomer_name());
		be.setCustomer_phone(this.getCustomer_phone());
		be.setItem_id(this.getItem_id());
		be.setItem_price(this.getItem_price());
		be.setOrderid(this.getOrderid());
		be.setCity(this.getCity());
		be.setPincode(this.getPincode());
		be.setLocality(this.getLocality());
		be.setQuantity(this.getQuantity());
	    be.setDoorno(this.getDoorno());
		return be;
	}
	@Override
	public String toString() {
		return "OrderDTO [OrderId="+ orderid + "CustomerId" +customer_id+"Customername"+ customer_name +"Email="+ customer_email +"Phonenumber="+ customer_phone +"ItemId"+item_id +
				"ItemPrice"+ item_price + "City"+ city+ "PinCode"+ pincode + "Locality"+ locality+ "Quantity"+ quantity+ "DoorNo"+ doorno+"]";
		

}}
