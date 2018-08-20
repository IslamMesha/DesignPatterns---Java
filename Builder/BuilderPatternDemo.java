/**
 * BuilderPatternDemo
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("vegMeal");
        vegMeal.showItems();
        System.out.println("Total Cost is: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("nonVegMeal");
        nonVegMeal.showItems();
        System.out.println("Total Cost is: " + nonVegMeal.getCost());

    };
}