import java.util.Scanner;

class CoffeeMachine {
    int CountWater;
    int TrashCount;
    int MilkCount;
    int TimerOn = 3;
    int TimerMakeCoffee = 5;

    public CoffeeMachine(int countWater, int trashCount, int milkCount) {
        this.CountWater = countWater;
        this.TrashCount = trashCount;
        this.MilkCount = milkCount;
    }

    static Scanner in = new Scanner(System.in);

    void CoffeMachineOn() throws InterruptedException {
        while (TimerOn != 0) {
            if (TimerOn != 1) {
                System.out.println("Запускаем кофемашину: осталось " + TimerOn + " секунды");
            } else {
                System.out.println("Запускаем кофемашину: осталась " + TimerOn + " секунда");
            }
            Thread.sleep(1000);
            TimerOn--;
        }
        System.out.println("Кофемашина включена и готова к работе");
    }

    void TemperatureWater() {
        System.out.println("Выберите температуру воды: ");
        System.out.println("[1] Низкая");
        System.out.println("[2] Стандартная");
        System.out.println("[3] Высокая");
        System.out.print("Введите цифру: ");
        int TempWaterChoose = in.nextInt();
        if (TempWaterChoose == 1) {
            System.out.println("Вы выбрали низкую температуру воды.");
        }
        if (TempWaterChoose == 2) {
            System.out.println("Вы выбрали стандартную температуру воды.");
        }
        if (TempWaterChoose == 3) {
            System.out.println("Вы выбрали высокую температуру воды.");
        }
    }

    void CountWater() {
        if (CountWater >= 40) {
            System.out.println("Имеется нужное количество воды.");
        } else {
            System.out.println("Не хватает воды, доливаем?");
            System.out.println("[1] Да");
            System.out.println("[2] Нет");
            System.out.println("Введите цифру от 1 до 2: ");
            int CountWaterChoose = in.nextInt();
            if (CountWaterChoose == 1) {
                CountWater += 40;
                System.out.println("Вы набрали воду и можете продолжать процесс заварки.");
            } else {
                System.out.println("Не получится сделать кофе.");
                System.exit(0);
            }
        }
    }

    void Trash() throws InterruptedException {
        if (TrashCount >= 5) {
            System.out.println("Очистите отсек с отходами.");
            System.out.println("[1] Очистить.");
            System.out.println("[2] Завершить процесс варки.");
            int TrashCountChoose = in.nextInt();
            if (TrashCountChoose == 1) {
                TrashCount = 0;
                Thread.sleep(400);
                System.out.println("Вы выкинули отходы.");
            }
            if (TrashCountChoose == 2) {
                System.exit(0);
            }
        } else {
            System.out.println("Отсек с отходами пуст.");
        }
    }

    void ChooseCoffee() {
        System.out.println("Выберите вид кофе: ");
        System.out.println("[1] Эспрессо");
        System.out.println("[2] Латте");
        System.out.println("[3] Капучино");
        System.out.println("[4] Американо");
        System.out.println("[5] Мокко");
        int ChooseCoffeeNumber = in.nextInt();
        System.out.println("Отличный выбор!");
        System.out.println("Добавляем молоко?");
        System.out.println("[1] Да");
        System.out.println("[2] Нет");
        int numb = in.nextInt();
        if (numb == 1) {
            if (MilkCount >= 5) {
                System.out.println("Вы добавили молоко.");
            } else {
                System.out.println("Не хватает молока.");
                System.exit(0);
            }
        }
        if (numb == 2) {
            System.out.println("Кофе будет без молока.");
        }
    }

    void CoffeeMachineOff() throws InterruptedException {
        while (TimerMakeCoffee != 0) {
            if (TimerMakeCoffee == 5) {
                System.out.println("Ваш кофе готовится. Осталось: " + TimerMakeCoffee + " секунд");
            } else {
                System.out.println("Ваш кофе готовится. Осталось: " + TimerMakeCoffee + " секунды");
            }
            Thread.sleep(1000);
            TimerMakeCoffee--;
        }
        System.out.println("Ваш кофе готов. Приятного кофепития:)");
    }

}
