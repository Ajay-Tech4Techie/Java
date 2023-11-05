package com.java.solid.design.principle.o.wrong.openclosed;

import java.util.List;
import java.util.stream.Stream;

public interface Filter <T>{
    Stream<T> filter(List<T> items, Specification<T> specification);
}
