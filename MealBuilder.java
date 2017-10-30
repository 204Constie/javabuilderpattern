package com.company;

/**
 * Created by constie on 30.10.2017.
 */
abstract class MealBuilder {
    protected Meal meal;

    public Meal getMeal(){
        return meal;
    }

    public void createNewMeal(){
        meal = new Meal();
    }

    public abstract void buildName();
    public abstract void buildDescription();
}

