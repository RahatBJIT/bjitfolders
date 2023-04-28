package org.example.builderdesignpattern.task;

 class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("Pan Backed");
    }

    @Override
    public void buildSauce() {
        pizza.setSause("Hot");

    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Peparoni+Salami");

    }
}
