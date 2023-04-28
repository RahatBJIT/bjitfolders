package org.example.builderdesignpattern.task;

class Pizza {
    private String dough = "";
    private String sause = "";
    private String topping = "";

    public void setDough(String dough){ this.dough=dough;}
    public void setSause(String sause){ this.sause=sause;}
    public void setTopping(String topping){ this.topping=topping;}

    public String toString(){
        return "Dough : " +dough + " Sause : " + sause +" Topping : "+topping;
    }


}
