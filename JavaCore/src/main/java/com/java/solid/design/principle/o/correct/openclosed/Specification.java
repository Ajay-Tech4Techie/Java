package com.java.solid.design.principle.o.correct.openclosed;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
