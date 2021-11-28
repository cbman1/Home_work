package CoffeeMachineRework.Ingridients;

public class Storage {
    int milk = 15;
    int water = 15;
    int sugar = 15;
    int coffeeBeams = 15;
    int hotChocolate = 15;

    public int getWater() {
        return water;
    }

    public int addWater() {
        return water + 15;
    }

    public int getSugar() {
        return sugar;
    }

    public int addSugar() {
        return sugar + 15;
    }

    public int getCoffeeBeams() {
        return coffeeBeams;
    }

    public int addCoffeeBeams() {
        return coffeeBeams + 15;
    }

    public int getHotChocolate() {
        return hotChocolate;
    }

    public int addHotChocolate() {
        return hotChocolate + 15;
    }

    public int getMilk() {
        return milk;
    }

    public int addMilk() {
        return milk + 15;
    }

}
