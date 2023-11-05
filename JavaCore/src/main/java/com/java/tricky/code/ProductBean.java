package com.java.tricky.code;

import java.util.Comparator;
import java.util.Date;

class ProductBean {
    //member vaiables
    String productId;
    int price;
    Date date;

    @Override
    public String toString() {
        return "ProductBean [Product ID: " + productId + "  Price: " + price + " Date Of Mfd: " + date + "]";
    }

    //default constructor
    ProductBean() {
    }

    //3 arg constructor
    ProductBean(String productId, int price, Date date) {
        this.productId = productId;
        this.price = price;
        this.date = date;
    }

    //Comparator implementation based on CompareByProductID
    class CompareByProductID implements Comparator<ProductBean> {
        public int compare(ProductBean p1, ProductBean p2) {
            if (p1.productId.compareTo(p2.productId) > 0) {
                return 1;
            }
            if (p1.productId.compareTo(p2.productId) < 0) {
                return -1;
            }
            // at this point all a.b,c,d are equal... so return "equal"
            return 0;
        }
/*        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }*/
    }

    class CompareByProductPrice implements Comparator<ProductBean> {
        @Override
        public int compare(ProductBean p1, ProductBean p2) {
            // this mean the first column is tied in thee two rows
            if (p1.price > p2.price) {
                return 1;
            }
            if (p1.price < p2.price) {
                return -1;
            }
            return 0;
        }
       /* public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }*/
    }

    class CompareByCreateDate implements Comparator<ProductBean> {
        @Override
        public int compare(ProductBean p1, ProductBean p2) {
            if (p1.date.after(p2.date)) {
                return 1;
            }
            if (p1.date.before(p2.date)) {
                return -1;
            }
            return 0;
        }
        /*@Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }*/
    }
}