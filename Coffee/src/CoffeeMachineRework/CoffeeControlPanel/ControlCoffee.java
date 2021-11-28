package CoffeeMachineRework.CoffeeControlPanel;

import CoffeeMachineRework.Models.ChoiceCoffee;
import CoffeeMachineRework.Models.CoffeeTurnOff;
import CoffeeMachineRework.Models.CoffeeTurnOn;
import CoffeeMachineRework.Models.MakeCoffee;
import CoffeeMachineRework.Recipes.CoffeeRecipes;
import CoffeeMachineRework.Recipes.CoffeeRecipesImpl;

import java.util.Scanner;

public class ControlCoffee {
    public static char saveChooserCoffee;
    static Scanner in = new Scanner(System.in);
    CoffeeRecipes coffee = new CoffeeRecipesImpl();
    CoffeeTurnOn coffeeOn = new CoffeeTurnOn();
    CoffeeTurnOff coffeeOff = new CoffeeTurnOff();
    ChoiceCoffee coffeeReady = new ChoiceCoffee();
    MakeCoffee coffeeMake = new MakeCoffee();

    public void coffeeMachineTurnOn() {
        System.out.println("Включаем кофе-машину?");
        System.out.println("[1] Да   [2] Нет");
        char chooserOn = in.next().charAt(0);
        switch (chooserOn) {
            case '1' -> {
                coffeeOn.CoffeeTurnOn();
            }
            case '2' -> {
                coffeeOff.CoffeeTurnOff();
            }
            default -> System.out.println("Выберите одно из предложенных выше значений.");
        }
    }

    public void chooseCoffee() {
        System.out.println("Выберите кофе:");
        System.out.println("[1] Эспрессо   [2] Арабика   [3] Мокко \n" +
                "[4] Латте      [5] Капучино [6] Макиато ");
        char chooserCoffee = in.next().charAt(0);
        saveChooserCoffee = chooserCoffee;
        switch (chooserCoffee) {
            case '1':
                coffee.Espresso();
                break;
            case '2':
                coffee.Arabica();
                break;
            case '3':
                coffee.Mocco();
                break;
            case '4':
                coffee.Latte();
                break;
            case '5':
                coffee.Cappucino();
                break;
            case '6':
                coffee.Maciato();
                break;
            default:
                System.out.println("Выберите одно из предложенных выше значений.");
                chooseCoffee();
        }
    }

    public void MakeCoffee() {
        coffeeMake.CoffeeMake();
    }

    public void CoffeeReady() {
        coffeeReady.CoffeeReady();
    }

    public void CoffeeMachineTurnOff() {
        coffeeOff.CoffeeTurnOff();
    }
}
