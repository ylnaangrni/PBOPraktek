package com;

import com.coffee.*;
import com.decorator.*;
import java.text.DecimalFormat;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Harga: Rp " + formatCurrency(coffee.getCost()));

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Harga: Rp " + formatCurrency(coffee.getCost()));

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Harga: Rp " + formatCurrency(coffee.getCost()));
    }

    private static String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(amount);
    }
}