package com.java.solid.design.principle.o.wrong.openclosed;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
