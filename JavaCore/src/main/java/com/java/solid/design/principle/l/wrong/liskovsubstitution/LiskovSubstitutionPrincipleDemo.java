package com.java.solid.design.principle.l.wrong.liskovsubstitution;

/**
 * Subtypes must be substitutable for their base types.
 *
 * At a high level, the LSP states that in an object-oriented program,
 * if we substitute a superclass object reference with an object of any of its subclasses,
 * the program should not break.
 */
public class LiskovSubstitutionPrincipleDemo {

    static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        //area = width * 10
        System.out.println(
                "Expected are of " + (width * 10) +
                        ", got "+r.getArea()
        );
    }

    public static void main(String[] args) {

    }
}


class Rectangle{
    protected int width;
    protected int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

class Square extends Rectangle{
    public Square(){}

    public Square(int size){
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height){
        super.setWidth(height);
        super.setHeight(height);
    }
}
