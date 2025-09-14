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

    // Listar todos
    @GetMapping
    public List<Order> findAll() {
        return orderService.listar();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        return orderService.buscarPorId(id);
    }

    // Criar novo
    @PostMapping
    public Order criar(@RequestBody Order order) {
        return orderService.criarOrder(order);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Order atualizar(@PathVariable Long id, @RequestBody Order order) {
        return orderService.atualizarOrder(id, order);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        orderService.deletarOrder(id);
    }
}
