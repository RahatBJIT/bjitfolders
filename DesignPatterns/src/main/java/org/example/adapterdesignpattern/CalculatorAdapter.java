package org.example.adapterdesignpattern;

public class CalculatorAdapter {
    public int GetArea(Square square){
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();

        rectangle.Width = rectangle.Height = square.size;
        int area = calculator.GetArea(rectangle);
        return area;
    }
}
