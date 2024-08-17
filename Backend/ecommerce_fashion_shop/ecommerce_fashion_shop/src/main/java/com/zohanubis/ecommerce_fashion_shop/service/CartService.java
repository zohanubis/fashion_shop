package com.zohanubis.ecommerce_fashion_shop.service;

import com.zohanubis.ecommerce_fashion_shop.exception.ProductException;
import com.zohanubis.ecommerce_fashion_shop.model.Cart;
import com.zohanubis.ecommerce_fashion_shop.model.User;
import com.zohanubis.ecommerce_fashion_shop.request.AddItemRequest;

public interface CartItemService {

        public Cart createCart(User user);

        public String addCartItem(Long userId, AddItemRequest request) throws ProductException;
        public  Cart findUserCart(Long userId);
}
