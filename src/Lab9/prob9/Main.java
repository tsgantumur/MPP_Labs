package Lab9.prob9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a
		System.out.println("a. Vegetarian: " + Dish.hasVegetarian(Dish.menu));
		//b
		System.out.println("b. less than 1000:" + Dish.lessThan1000(Dish.menu));
		//c
		System.out.println("c. greater than 1000:" + Dish.greaterThan1000(Dish.menu));
		//d
		System.out.println("d. first item of type of MEAT: " + Dish.FirstItemofMeat(Dish.menu).get());
		//e
		System.out.println("e. All calories: " + Dish.calculateTotalCalories(Dish.menu));
		//f
		System.out.println("f. All calories Method Reference: " + Dish.calculateTotalCaloriesMethodReference(Dish.menu));
	}

}
