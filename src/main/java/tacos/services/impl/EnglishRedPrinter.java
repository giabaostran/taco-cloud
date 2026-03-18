package tacos.services.impl;

import tacos.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {

    @Override
    public void print() {
       System.out.println("English Red");
    }

}
