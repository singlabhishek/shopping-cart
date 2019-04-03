package com.ecommerce.cart.bean;

import lombok.Data;

@Data
public class Item extends Bean {

    private String productId;
    private Integer salePrice;
    private Integer count;

}
