package com.ecommerce.cart.bean;

import com.ecommerce.cart.enums.ProductCategory;
import com.ecommerce.cart.enums.ProductType;
import lombok.Data;

@Data
public class Product extends Bean {

    private String name;
    private Integer count;
    private ProductType type;
    private ProductCategory category;
    private Integer costPrice;
    private Double discount;

}
