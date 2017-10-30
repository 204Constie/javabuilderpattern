package com.company;

/**
 * Created by constie on 30.10.2017.
 */
class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mb){
        mealBuilder = mb;
    }

    public Meal getMeal(){
        System.out.println("serve meal");
        return mealBuilder.getMeal();
    }

    public void constructMeal(){
        System.out.println("construct new meal");
        mealBuilder.createNewMeal();
        mealBuilder.buildName();
        mealBuilder.buildDescription();
    }
}
