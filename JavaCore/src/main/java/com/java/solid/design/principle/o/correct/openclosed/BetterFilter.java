package com.java.solid.design.principle.o.correct.openclosed;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product>{
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(product -> specification.isSatisfied(product));
    }
}
