package org.example.adapterdesignpattern;

public class Calculator {
    public int GetArea(Rectangle rectangle){
        int area = rectangle.Width * rectangle.Height;
        return area;
    }
}
