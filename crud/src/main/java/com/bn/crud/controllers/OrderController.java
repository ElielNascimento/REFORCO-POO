package com.bn.crud.controllers;

import com.bn.crud.models.Order;
import com.bn.crud.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> findAll(){
        return orderService.listar();
    }

    @PostMapping
    public Order criar( @RequestBody Order order){
        return orderService.criarOrder(order);
    }

}
