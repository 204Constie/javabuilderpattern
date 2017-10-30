package com.company;

/**
 * Created by constie on 30.10.2017.
 */
public class DinnerBuilder extends MealBuilder {
    public void buildName(){
        System.out.println("build name for meal dinner");
        meal.setName("dinner");
    }

    public void buildDescription(){
        System.out.println("build description for meal dinner");
        meal.setDescription("huge steak with barbecue sauce");
    }

    public void buildPrice(){
        System.out.println("build price for meal dinner");
        meal.setPrice(65);
    }
}
