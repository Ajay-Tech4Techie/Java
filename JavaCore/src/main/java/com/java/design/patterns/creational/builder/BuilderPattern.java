package com.java.design.patterns.creational.builder;

public class BuilderPattern {

    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    //static inner class Builder
    public static class Builder {
        //required parameters
        private final int servingSize;
        private final int serving;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        //builder Constructor
        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    private BuilderPattern(Builder builder) {
        servingSize = builder.servingSize;
        serving = builder.serving;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
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
