package com.ecommerce.cart.controller;

import com.ecommerce.cart.bean.Cart;
import com.ecommerce.cart.enums.CartStatus;
import com.ecommerce.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/carts")
@RestController
public class CartControler {

    @Autowired
    private CartService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> listCart(@RequestParam CartStatus status) {
        return new ResponseEntity<>(service.listCart(status), HttpStatus.OK);
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public ResponseEntity<?> listAndSortCart(@RequestParam CartStatus status) {
        return new ResponseEntity<>(service.listAndSortCart(status), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> insert(@RequestBody List<Cart> carts) {
        service.insert(carts);
        return new ResponseEntity<>(Void.class, HttpStatus.OK);
    }

}
