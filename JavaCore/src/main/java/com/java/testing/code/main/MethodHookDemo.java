package com.java.testing.code.main;

import com.java.testing.code.CommerceAddToCartMethodHook;
import com.java.testing.code.impl.BundleCommerceAddToCartMethodHook;
import com.java.testing.code.impl.StandaloneProductCommerceAddToCartMethodHook;
import com.java.testing.code.impl.SubcriptionCommerceAddToCartMethodHook;

import java.util.ArrayList;
import java.util.List;

public class MethodHookDemo {
    public static void main(String[] args) {
        List<CommerceAddToCartMethodHook> commerceAddToCartMethodHookList = new ArrayList<>();
        commerceAddToCartMethodHookList.add(new StandaloneProductCommerceAddToCartMethodHook());
        commerceAddToCartMethodHookList.add(new BundleCommerceAddToCartMethodHook());
        commerceAddToCartMethodHookList.add(new SubcriptionCommerceAddToCartMethodHook());

        for (CommerceAddToCartMethodHook commerceAddToCartMethodHook : commerceAddToCartMethodHookList) {
            if (commerceAddToCartMethodHook instanceof BundleCommerceAddToCartMethodHook)
                continue;
            commerceAddToCartMethodHook.beforeAddToCart();
        }
    }
}
