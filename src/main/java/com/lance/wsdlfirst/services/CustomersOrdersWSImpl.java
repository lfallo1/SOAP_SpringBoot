package com.lance.wsdlfirst.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lance.services.customerorders.AllOrdersRequest;
import com.lance.services.customerorders.AllOrdersResponse;
import com.lance.services.customerorders.CreateOrdersRequest;
import com.lance.services.customerorders.CreateOrdersResponse;
import com.lance.services.customerorders.CustomerOrdersPortType;
import com.lance.services.customerorders.DeleteOrdersRequest;
import com.lance.services.customerorders.DeleteOrdersResponse;
import com.lance.services.customerorders.GetOrdersRequest;
import com.lance.services.customerorders.GetOrdersResponse;
import com.lance.services.customerorders.Order;
import com.lance.services.customerorders.Product;

public class CustomersOrdersWSImpl implements CustomerOrdersPortType {

	Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
	int currentCustomerId;

	public CustomersOrdersWSImpl(){ 
		init(); 
	}

	public void init() {
		List<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setId(BigInteger.valueOf(1));
		Product product = new Product();
		product.setDescription("IPhone");
		product.setId("1");
		product.setQuantity(BigInteger.valueOf(3));

		order.getProduct().add(product);

		orders.add(order);
		customerOrders.put(BigInteger.valueOf(++currentCustomerId), orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {
		GetOrdersResponse response = new GetOrdersResponse();
		List<Order> orders = customerOrders.get(request.getCustomerId());
		if(orders != null){
			response.getOrder().addAll(orders);
		}
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
		
		List<Order> orders = customerOrders.get(request.getCustomerId());
		if(orders == null){
			customerOrders.put(request.getCustomerId(), Arrays.asList(request.getOrder()));
		} else{
			orders.add(request.getOrder());
		}
		
		CreateOrdersResponse response = new CreateOrdersResponse();
		response.setResult(true);
		return response;
	}

	@Override
	public DeleteOrdersResponse deleteOrders(DeleteOrdersRequest request) {
		customerOrders.remove(request.getCustomerId());
		DeleteOrdersResponse response = new DeleteOrdersResponse();
		response.setResult(true);
		return response;
	}

	@Override
	public AllOrdersResponse allOrders(AllOrdersRequest parameters) {
		
		List<Order> orders = customerOrders.entrySet().stream()
			.map(orderList->orderList.getValue())
			.flatMap(orderList->orderList.stream())
			.collect(Collectors.toList());
		
		AllOrdersResponse response = new AllOrdersResponse();
		response.getOrder().addAll(orders);
		return response;
	}

}
