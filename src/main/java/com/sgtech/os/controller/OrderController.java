package com.sgtech.os.controller;

import com.sgtech.os.entity.Order;
import com.sgtech.os.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order){
       return service.saveOrder(order);
    }
}
