public class Main {
  
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine CoffeeMach1 = new CoffeeMachine(10,60,10);
        CoffeeMach1.CoffeMachineOn();
        CoffeeMach1.CountWater();
        CoffeeMach1.TemperatureWater();
        CoffeeMach1.Trash();
        CoffeeMach1.ChooseCoffee();
        CoffeeMach1.CoffeeMachineOff();
    }
}
