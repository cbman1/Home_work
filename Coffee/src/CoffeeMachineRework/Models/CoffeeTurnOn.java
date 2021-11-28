package CoffeeMachineRework.Models;

public class CoffeeTurnOn {
    public void CoffeeTurnOn() {
        int timerOn = 3;
        while (timerOn != 0) {
            if (timerOn != 1) {
                System.out.println("Запускаем кофемашину: осталось " + timerOn + " секунды");
            } else {
                System.out.println("Запускаем кофемашину: осталась " + timerOn + " секунда");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timerOn--;
        }
        System.out.println("Кофе машина включена.");
    }
}
