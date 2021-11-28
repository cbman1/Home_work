package CoffeeMachineRework;

import CoffeeMachineRework.CoffeeControlPanel.ControlCoffee;

public class Main {

    public static void main(String[] args) {
        ControlCoffee coffeeMachine = new ControlCoffee();
        coffeeMachine.coffeeMachineTurnOn();
        coffeeMachine.chooseCoffee();
        coffeeMachine.MakeCoffee();
        coffeeMachine.CoffeeReady();
        coffeeMachine.CoffeeMachineTurnOff();
    }
}
