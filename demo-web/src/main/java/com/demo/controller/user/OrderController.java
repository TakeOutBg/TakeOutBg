package com.demo.controller.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Order;
import com.demo.entity.OrderDtl;
import com.demo.inner.dto.AjaxResult;
import com.demo.mapper.OrderMapper;
import com.demo.service.OrderDtlService;
import com.demo.service.OrderService;

@Controller
@ResponseBody
@RequestMapping(value = "/order")
public class OrderController extends BaseController<Order, OrderMapper, OrderService> {

	@Autowired
	protected OrderDtlService orderDtlService;
	
	@RequestMapping(value = "/getOrdersByID.do",method = RequestMethod.GET)
	public AjaxResult<Order> getOrdersByID(String ID){
		
		AjaxResult<Order> result = new AjaxResult<Order>();
		Order order = service.selectByPrimaryKey(ID);
		OrderDtl dtl = new OrderDtl();
		dtl.setOrderId(ID);
		List<OrderDtl> dtls = orderDtlService.select(dtl);
		order.setOrderDtls(dtls);
		result.setObject(order);
		return result;
	}
	
	@RequestMapping(value = "/getOrdersByUserID.do",method = RequestMethod.GET)
	public AjaxResult<Order> getOrdersByUserID(String userID){
		
		AjaxResult<Order> result = new AjaxResult<Order>();
		result.setResult(service.selecOrdersByUserID(userID));
		result.setStatus("202");
		
		return result;
	}

	@RequestMapping(value = "/getOrderDetail.do",method = RequestMethod.GET)
	public AjaxResult<OrderDtl> getOrderDetail(String orderID){
		
		AjaxResult<OrderDtl> result = new AjaxResult<OrderDtl>(); 
		result.setResult(orderDtlService.selectDtlByOrderID(orderID));
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/delteOrderItem.do",method = RequestMethod.GET)
	public AjaxResult<OrderDtl> delteOrderItem(String orderDtlID){
		
		AjaxResult<OrderDtl> result = new AjaxResult<OrderDtl>(); 
		orderDtlService.deleteByPrimaryKey(new OrderDtl(orderDtlID));
		result.setStatus("202");
		
		return result;
	}
	
	@RequestMapping(value = "/createOrder.do",method = RequestMethod.POST)
	public AjaxResult<Order> createOrder(@RequestBody Order order){
		
		AjaxResult<Order> result = new AjaxResult<Order>();
		
		
		order.setId(UUID.randomUUID().toString());
		service.insertSelective(order);
		
		for(OrderDtl orderdtl: order.getOrderDtls()) {
			orderdtl.setId(UUID.randomUUID().toString());
			orderdtl.setOrderId(order.getId());
			orderDtlService.insertSelective(orderdtl);
		}
		
		result.setStatus("202");
		result.setObject(order);
		return result;
	}
	
	
	@RequestMapping(value = "/updateOrder.do",method = RequestMethod.GET)
	public AjaxResult<Order> updateOrder(Order order){
		
		AjaxResult<Order> result = new AjaxResult<Order>();
		
		service.updateByPrimaryKey(order);
		
		result.setStatus("202");
		return result;
		
	}
	
	@RequestMapping(value = "/updateOrderDtl.do",method = RequestMethod.GET)
	public AjaxResult<OrderDtl> updateOrderDtl(OrderDtl orderDtl){
		
		AjaxResult<OrderDtl> result = new AjaxResult<OrderDtl>();
		
		orderDtlService.updateByPrimaryKey(orderDtl);
		
		result.setStatus("202");
		return result;
		
	}
	
	
}
