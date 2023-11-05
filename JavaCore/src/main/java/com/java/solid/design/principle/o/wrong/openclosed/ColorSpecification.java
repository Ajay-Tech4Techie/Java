package com.java.solid.design.principle.o.wrong.openclosed;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }


    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
