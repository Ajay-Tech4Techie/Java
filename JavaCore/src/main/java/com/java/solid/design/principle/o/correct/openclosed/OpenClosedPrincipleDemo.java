package com.java.solid.design.principle.o.correct.openclosed;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Open for extension but closed for modifications.
public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        Product product1 = new Product("100", "Nike Shoes", Color.RED, Size.SMALL);
        Product product2 = new Product("101", "Reebok", Color.BLUE, Size.MEDIUM);
        Product product3 = new Product("102", "Fila", Color.GREEN, Size.LARGE);
        Product product4 = new Product("103", "Addidas", Color.RED, Size.MEDIUM);

        List<Product> products = Arrays.asList(product1, product2, product3, product4);

        //with Open Closed Principle
        BetterFilter betterFilter = new BetterFilter();
        System.out.println(" BetterFilter  :");
        //betterFilter.filter(products, new ColorSpecification(Color.RED)).forEach(product -> System.out.println(product));
        List<Product> refinedProducts = betterFilter.filter(products, new ColorSpecification(Color.RED)).collect(Collectors.toList());
        Map<String, Product> refinedProductsMap = betterFilter.filter(products, new ColorSpecification(Color.RED)).collect(Collectors.toMap(product -> product.getSku(), product -> product));
        refinedProducts.forEach(product -> System.out.println(product));


        System.out.println("refinedMap : "+refinedProductsMap);

        System.out.println("Red and Small items : ");

        betterFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.RED),
                new SizeSpecification(Size.SMALL)
        )).forEach(product -> System.out.println(product));
    }
}


enum Color {RED, GREEN, BLUE}
enum Size {SMALL, MEDIUM, LARGE}

