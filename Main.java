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


		System.out.println("the meal is: " + meal1.getName() + " that consists of: " + meal1.getDescription() + " and costs: " + meal1.getPrice() + "$");
		System.out.println("the meal is: " + meal2.getName() + " that consists of: " + meal2.getDescription() + " and costs: " + meal2.getPrice() + "$");
		System.out.println("the meal is: " + meal3.getName() + " that consists of: " + meal3.getDescription() + " and costs: " + meal3.getPrice() + "$");
	}
}
