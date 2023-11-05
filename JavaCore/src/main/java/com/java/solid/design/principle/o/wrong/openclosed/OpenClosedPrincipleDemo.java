package com.java.solid.design.principle.o.wrong.openclosed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Open for extension but closed for modifications.
public class OpenClosedPrincipleDemo {
    public static void main(String[] args) {
        Product product1 = new Product("100", "Nike Shoes", Color.RED, Size.SMALL);
        Product product2 = new Product("101", "Reebok", Color.BLUE, Size.MEDIUM);
        Product product3 = new Product("102", "Fila", Color.GREEN, Size.LARGE);
        Product product4 = new Product("103", "Addidas", Color.RED, Size.MEDIUM);

        List<Product> products = Arrays.asList(product1, product2, product3, product4);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("filterByColor :");
        Stream<Product> productStream = productFilter.filterByColor(products, Color.RED);
        productStream.forEach(s -> System.out.println(s));

        System.out.println("filterBySize :");
        Stream<Product> productStream1 = productFilter.filterBySize(products, Size.LARGE);
        productStream1.forEach(s -> System.out.println(s));

        System.out.println("filterByColorAndSize :");
        Stream<Product> productStream2 = productFilter.filterByColorAndSize(products, Color.RED, Size.MEDIUM);
        productStream2.forEach(s -> System.out.println(s));
    }
}

enum Color {RED, GREEN, BLUE}
enum Size {SMALL, MEDIUM, LARGE}

class Product{
    private String sku;
    private String name;
    private Color color;
    private Size size;

    public Product(String sku, String name, Color color, Size size) {
        this.sku = sku;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}


class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.getSize() == size && product.getColor() == color);
    }

}