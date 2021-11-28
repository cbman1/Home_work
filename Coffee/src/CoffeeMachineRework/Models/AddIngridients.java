package CoffeeMachineRework.Models;

import CoffeeMachineRework.Ingridients.Storage;

import java.util.Scanner;

public class AddIngridients {
    Storage storage = new Storage();
    Scanner in = new Scanner(System.in);

    public void addMilk() {
        if (storage.getMilk() >= 4) {
            System.out.println("Вы добавили молоко.");
        } else {
            System.out.println("Молока не хватает, докупаем?\n" +
                    "[1] Да  [2] Нет");
            char chooseAddMilk = in.next().charAt(0);
            switch (chooseAddMilk) {
                case '1':
                    storage.addMilk();
                    System.out.println("Вы добавили молоко.");
                    break;
                case '2':
                    System.out.println("Вы не можете добавить молоко.");
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    addMilk();
            }
        }
    }

    public void addIngridients() {
        storage.addCoffeeBeams();
        storage.addWater();
        storage.addSugar();
        storage.addHotChocolate();
    }

}
