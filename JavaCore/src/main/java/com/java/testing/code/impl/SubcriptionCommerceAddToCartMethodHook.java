package com.java.testing.code.impl;

import com.java.testing.code.CommerceAddToCartMethodHook;

public class SubcriptionCommerceAddToCartMethodHook implements CommerceAddToCartMethodHook {
    @Override
    public void beforeAddToCart() {
        System.out.println("SubcriptionCommerceAddToCartMethodHook : beforeAddToCart");
    }

    @Override
    public void afterAddToCart() {
        System.out.println("SubcriptionCommerceAddToCartMethodHook : afterAddToCart");
    }
}
