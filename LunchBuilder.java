package com.company;

/**
 * Created by constie on 30.10.2017.
 */
public class LunchBuilder extends MealBuilder {
    public void buildName(){
        System.out.println("build name for meal lunch");
        meal.setName("lunch");
    }

    public void buildDescription(){
        System.out.println("build description for meal lunch");
        meal.setDescription("rice with pumpkin on onions");
    }
}
