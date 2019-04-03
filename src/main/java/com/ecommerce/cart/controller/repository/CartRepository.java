package com.ecommerce.cart.controller.repository;

import com.ecommerce.cart.bean.Cart;
import com.ecommerce.cart.enums.CartStatus;

import java.util.List;

public interface CartRepository {

    List<Cart> findByStatus(CartStatus status);

    void insert(List<Cart> carts);
}
