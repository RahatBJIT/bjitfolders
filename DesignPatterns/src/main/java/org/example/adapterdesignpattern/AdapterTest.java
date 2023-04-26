package org.example.adapterdesignpattern;

public class AdapterTest {
    public static void main(String[] args) {
        Square square = new Square();
        square.size = 10;

        CalculatorAdapter adapter = new CalculatorAdapter();
        int area = adapter.GetArea(square);
        System.out.println("Area is : "+ area);

    }
}
