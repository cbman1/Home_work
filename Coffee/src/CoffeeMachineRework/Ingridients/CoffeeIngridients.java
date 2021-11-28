package CoffeeMachineRework.Ingridients;

public class CoffeeIngridients {
    Storage storage = new Storage();

    public boolean espressoIngridients() {
        return storage.getCoffeeBeams() >= 10 && storage.getSugar() >= 4 && storage.getWater() >= 12;
    }

    public boolean arabicaIngridients() {
        return storage.getCoffeeBeams() >= 10 && storage.getSugar() >= 5 && storage.getWater() >= 10;
    }

    public boolean moccoIngridients() {
        return storage.getCoffeeBeams() >= 9 && storage.getHotChocolate() >= 6 && storage.getWater() >= 4;
    }

    public boolean latteIngridients() {
        return storage.getCoffeeBeams() >= 7 && storage.getWater() >= 11 && storage.getMilk() >= 12;
    }

    public boolean capuccinoIngridients() {
        return storage.getCoffeeBeams() >= 9 && storage.getWater() >= 13 && storage.getMilk() >= 9;
    }

    public boolean maciatoIngridients() {
        return storage.getCoffeeBeams() >= 8 && storage.getWater() >= 7 && storage.getSugar() >= 7;
    }

}
