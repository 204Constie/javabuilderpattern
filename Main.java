package com.company;

public class Main {

    public static void main(String[] args) {
	    Waiter waiter = new Waiter();
	    MealBuilder lunchBuilder = new LunchBuilder();
		MealBuilder breakfastBuilder = new BreakfastBuilder();
		MealBuilder dinnerBuilder = new DinnerBuilder();

	    waiter.setMealBuilder(lunchBuilder);
		waiter.constructMeal();
		Meal meal1 = waiter.getMeal();
	    waiter.setMealBuilder(breakfastBuilder);
		waiter.constructMeal();
		Meal meal2 = waiter.getMeal();
	    waiter.setMealBuilder(dinnerBuilder);
	    waiter.constructMeal();
		Meal meal3 = waiter.getMeal();


		System.out.println("the meal is: " + meal1.getName() + " and consists of: " + meal1.getDescription());
		System.out.println("the meal is: " + meal2.getName() + " and consists of: " + meal2.getDescription());
		System.out.println("the meal is: " + meal3.getName() + " and consists of: " + meal3.getDescription());
	}
}
