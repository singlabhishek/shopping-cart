package com.ecommerce.cart.service.impl;

import com.ecommerce.cart.bean.Cart;
import com.ecommerce.cart.repository.CartRepository;
import com.ecommerce.cart.enums.CartStatus;
import com.ecommerce.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository repository;

    @Override
    public List<Cart> listCart(CartStatus status) {
        return repository.findByStatus(status);
    }

    @Override
    public List<Cart> listAndSortCart(CartStatus status) {
        List<Cart> searchResults = repository.findByStatus(status);
        sort(searchResults);

        return searchResults;
    }

    public void insert(List<Cart> carts) {
        repository.insert(carts);
    }

    private void sort(List<Cart> carts) {
        Collections.sort(carts, new Comparator<Cart>() {
            @Override
            public int compare(Cart o1, Cart o2) {
                return o1.getTotalItems() - o2.getTotalItems();
            }
        });
    }

}
