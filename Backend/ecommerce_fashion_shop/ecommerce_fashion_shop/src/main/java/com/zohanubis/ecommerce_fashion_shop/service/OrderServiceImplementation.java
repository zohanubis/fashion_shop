package com.zohanubis.ecommerce_fashion_shop.service;

import java.util.List;

import com.zohanubis.ecommerce_fashion_shop.repository.CartRepository;
import org.springframework.stereotype.Service;

import com.zohanubis.ecommerce_fashion_shop.exception.OrderException;
import com.zohanubis.ecommerce_fashion_shop.model.Address;
import com.zohanubis.ecommerce_fashion_shop.model.Order;
import com.zohanubis.ecommerce_fashion_shop.model.User;

@Service
public class OrderServiceImplementation implements OrderService {

    private CartRepository cartRepository;
    private CartService cartService;
    private ProductService productService;

    public OrderServiceImplementation(CartRepository cartRepository, CartService cartService, ProductService productService) {
        this.cartRepository = cartRepository;
        this.cartService = cartService;
        this.productService = productService;
    }

    @Override
    public Order createOrder(User user, Address shippingAddress) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order findOrderById(Long userId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order placeOrder(Order orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order updateOrder(Order orderId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order cancledOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> getAllOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub

    }

}
