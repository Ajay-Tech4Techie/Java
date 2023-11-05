package com.java.solid.design.principle.o.correct.openclosed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
class Product{
    private String sku;
    private String name;
    private Color color;
    private Size size;
}
