package com.zohanubis.ecommerce_fashion_shop.controller;

import com.zohanubis.ecommerce_fashion_shop.exception.UserException;
import com.zohanubis.ecommerce_fashion_shop.model.Cart;
import com.zohanubis.ecommerce_fashion_shop.model.CartItem;
import com.zohanubis.ecommerce_fashion_shop.model.User;
import com.zohanubis.ecommerce_fashion_shop.service.CartItemService;
import com.zohanubis.ecommerce_fashion_shop.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;
    ;
    @Autowired
    private UserService userService;


    @GetMapping("/cardId")
    @Operation(description = "Find cart item by cart Id")
    public ResponseEntity<CartItem> findUserCartItem(@RequestHeader ("Authorization")String jwt) throws UserException {
        User user = userService.findUserProfileByJwt(jwt);
        CartItem cartItem = new CartItem();

        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }

}
