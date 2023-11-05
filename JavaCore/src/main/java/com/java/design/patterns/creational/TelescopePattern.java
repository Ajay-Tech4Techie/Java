package com.java.design.patterns.creational;

public class TelescopePattern {

    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public TelescopePattern(int servingSize, int serving) {
        this(servingSize, serving, 0);
        System.out.println("2 arg - Constructor");
    }

    public TelescopePattern(int servingSize, int serving, int calories) {
        this(servingSize, serving, calories, 0);
        System.out.println("3 arg - Constructor");
    }

    public TelescopePattern(int servingSize, int serving, int calories, int fat) {
        this(servingSize, serving, calories, fat, 0);
        System.out.println("4 arg - Constructor");
    }


    public TelescopePattern(int servingSize, int serving, int calories, int fat, int sodium) {
        this(servingSize, serving, calories, fat, sodium, 0);
        System.out.println("5 arg - Constructor");
    }

    public TelescopePattern(int servingSize, int serving, int calories,
                            int fat, int sodium, int carbohydrate) {
        System.out.println("6 arg - Constructor");
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }


    public String toString() {
        return ""
                + "\n servingSize (Mandatory)       :" + servingSize
                + "\n serving (Mandatory) 		   :" + serving
                + "\n calories (Optional)		   :" + calories
                + "\n fat  (Optional) 			   :" + fat
                + "\n sodium  (Optional)			   :" + sodium
                + "\n carbohydrate  (Optional)      :" + carbohydrate;
    }


}
