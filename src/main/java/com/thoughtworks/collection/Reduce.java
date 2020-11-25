package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, Double::sum)
                / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(0, (max, item) -> item >= max ? item : max);
    }

    public int getLastOdd() {
        return arrayList.stream()
                .filter(item -> item % 2 == 1)
                .reduce(0, (result, item) -> item);
    }
}
