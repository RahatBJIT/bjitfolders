package org.example.builderdesignpattern.task;

 class HawaiianPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("Cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSause("mild");

    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
