package com.java.testing.code.impl;

import com.java.testing.code.CommerceAddToCartMethodHook;

public class StandaloneProductCommerceAddToCartMethodHook implements CommerceAddToCartMethodHook {
    @Override
    public void beforeAddToCart() {
        System.out.println("StandaloneProductCommerceAddToCartMethodHook : beforeAddToCart");
    }

    @Override
    public void afterAddToCart() {
        System.out.println("StandaloneProductCommerceAddToCartMethodHook : afterAddToCart");
    }
}
