package com.ecommerce.cart.controller.repository.impl;

import com.ecommerce.cart.bean.Cart;
import com.ecommerce.cart.controller.repository.CartRepository;
import com.ecommerce.cart.enums.CartStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepositoryImpl implements CartRepository {


    private List<Cart> database = new ArrayList<>();

    public List<Cart> findByStatus(CartStatus status) {

        List<Cart> searchResult = new ArrayList<>();
        for (Cart cart : database) {
            if (cart.getStatus().equals(status)) {
                searchResult.add(cart);
            }
        }

        return searchResult;
    }

    public void insert(List<Cart> carts) {
        database.addAll(carts);
    }

}
