package com.bn.crud.services;


import com.bn.crud.models.Order;
import com.bn.crud.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listar(){
        return  orderRepository.findAll();
    }

    public Order criarOrder(Order order){
        return  orderRepository.save(order);
    }




}
