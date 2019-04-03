package com.ecommerce.cart.service;

import com.ecommerce.cart.bean.Cart;
import com.ecommerce.cart.enums.CartStatus;

import java.util.List;

public interface CartService {

    List<Cart> listCart(CartStatus status);

    List<Cart> listAndSortCart(CartStatus status);

    void insert(List<Cart> carts);
}
