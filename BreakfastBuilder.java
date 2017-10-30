package com.company;

/**
 * Created by constie on 30.10.2017.
 */
public class BreakfastBuilder extends MealBuilder {
    public void buildName(){
        System.out.println("build name for meal breakfast");
        meal.setName("brekfast");
    }

    public void buildDescription(){
        System.out.println("build description for meal breakfast");
        meal.setDescription("oatmeal and apple");
    }

    public void buildPrice(){
        System.out.println("build price for meal breakfast");
        meal.setPrice(25);
    }
}

