package com.java.tricky.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GroupByImpJava {

    public static void main(String[] args) {
        ProductBean p1 = new ProductBean("P1", 20, new Date());
        ProductBean p2 = new ProductBean("P1", 30, new Date());
        ProductBean p3 = new ProductBean("P2", 20, new Date());
        ProductBean p4 = new ProductBean("P1", 20, new Date());
        ProductBean p5 = new ProductBean("P3", 60, new Date());
        ProductBean p6 = new ProductBean("P1", 20, new Date());

        List<ProductBean> list = new ArrayList<ProductBean>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            ProductBean bean = (ProductBean) iterator.next();
            System.out.println(bean);
        }

        System.out.println("******** AFTER GROUP BY PRODUCT_ID ******");
        Collections.sort(list, new ProductBean().new CompareByProductID());
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            ProductBean bean = (ProductBean) iterator.next();
            System.out.println(bean);
        }

        System.out.println("******** AFTER GROUP BY PRICE ******");
        Collections.sort(list, new ProductBean().new CompareByProductPrice());
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            ProductBean bean = (ProductBean) iterator.next();
            System.out.println(bean);
        }

    }
}
