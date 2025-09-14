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

    // Listar todos
    public List<Order> listar() {
        return orderRepository.findAll();
    }

    // Buscar por ID
    public Order buscarPorId(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order não encontrado com id " + id));
    }

    // Criar novo pedido
    public Order criarOrder(Order order) {
        return orderRepository.save(order);
    }

    // Atualizar pedido
    public Order atualizarOrder(Long id, Order orderAtualizado) {
        Order order = buscarPorId(id);
        order.setAddress(orderAtualizado.getAddress());
        order.setLatitude(orderAtualizado.getLatitude());
        order.setLongitude(orderAtualizado.getLongitude());
        return orderRepository.save(order);
    }

    // Deletar pedido
    public void deletarOrder(Long id) {
        Order order = buscarPorId(id);
        orderRepository.delete(order);
    }
}
