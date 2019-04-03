package com.ecommerce.cart.bean;

import com.ecommerce.cart.enums.CartStatus;
import lombok.Data;

import java.util.List;

@Data
public class Cart extends Bean {

    private String userId;
    private List<Item> items;
    private Integer totalItems;
    private Integer value;
    private CartStatus status;

}
