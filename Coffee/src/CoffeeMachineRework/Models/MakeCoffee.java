package CoffeeMachineRework.Models;

public class MakeCoffee {
    int TimerMakeCoffee = 5;

    public void CoffeeMake() {
        System.out.println("Измельчаем кофейные зерна");
        System.out.println("Спрессовываем получившийся кофейный порошок");
        System.out.println("Нагреваем воду до нужной температуры");
        while (TimerMakeCoffee != 0) {
            if (TimerMakeCoffee == 5) {
                System.out.println("Ваш кофе готовится. Осталось: " + TimerMakeCoffee + " секунд");
            } else {
                System.out.println("Ваш кофе готовится. Осталось: " + TimerMakeCoffee + " секунды");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TimerMakeCoffee--;
        }
    }
}
