package com.java.testing.code.impl;

import com.java.testing.code.CommerceAddToCartMethodHook;

public class BundleCommerceAddToCartMethodHook implements CommerceAddToCartMethodHook {
    @Override
    public void beforeAddToCart() {
        System.out.println("BundleCommerceAddToCartMethodHook : beforeAddToCart");
    }

    @Override
    public void afterAddToCart() {
        System.out.println("BundleCommerceAddToCartMethodHook : afterAddToCart");
    }
}
