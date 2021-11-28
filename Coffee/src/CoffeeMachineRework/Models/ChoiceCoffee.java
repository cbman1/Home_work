package CoffeeMachineRework.Models;

import CoffeeMachineRework.CoffeeControlPanel.ControlCoffee;

public class ChoiceCoffee {
    public void CoffeeReady() {
        switch (ControlCoffee.saveChooserCoffee) {
            case '1':
                System.out.println("Ваш эспрессо готов");
                break;
            case '2':
                System.out.println("Ваш арабика готов.");
                break;
            case '3':
                System.out.println("Ваш мокко готов");
                break;
            case '4':
                System.out.println("Ваш латте готов.");
                break;
            case '5':
                System.out.println("Ваш капучино готов");
                break;
            case '6':
                System.out.println("Ваш макиато готов.");
                break;
        }
    }
}
