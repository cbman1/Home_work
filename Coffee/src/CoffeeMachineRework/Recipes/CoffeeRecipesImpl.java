package CoffeeMachineRework.Recipes;

import CoffeeMachineRework.Ingridients.CoffeeIngridients;
import CoffeeMachineRework.Models.AddIngridients;

import java.util.Scanner;

public class CoffeeRecipesImpl implements CoffeeRecipes {
    Scanner in = new Scanner(System.in);
    AddIngridients AddIngridients = new AddIngridients();
    CoffeeIngridients coffeeIngridients = new CoffeeIngridients();

    @Override
    public void Espresso() {
        System.out.println("Вы выбрали эспрессо, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.espressoIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }

    @Override
    public void Arabica() {
        System.out.println("Вы выбрали арабика, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.arabicaIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }

    @Override
    public void Mocco() {
        System.out.println("Вы выбрали мокко, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.moccoIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }

    @Override
    public void Latte() {
        System.out.println("Вы выбрали латте, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.latteIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }

    @Override
    public void Cappucino() {
        System.out.println("Вы выбрали капучино, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.capuccinoIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }

                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }

    @Override
    public void Maciato() {
        System.out.println("Вы выбрали макиато, сейчас проверим наличие ингридиентов.");
        if (coffeeIngridients.maciatoIngridients()) {
            System.out.println("Все ингридиенты есть, добавляем молоко?\n " +
                    "[1] Да   [2] Нет");
            int chooserMilk = in.next().charAt(0);
            switch (chooserMilk) {
                case '1':
                    AddIngridients.addMilk();
                    break;
                case '2':
                    System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                    break;
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;

            }

        } else {
            System.out.println("Ингридиентов недостаточно, докупаем?\n" +
                    "[1] Да   [2] Нет");
            int chooserAddIngridients = in.next().charAt(0);
            switch (chooserAddIngridients) {
                case '1':
                    AddIngridients.addIngridients();
                    System.out.println("Ингридиенты докуплены, добавим молока?\n" +
                            "[1] Да   [2] Нет");
                    int chooserMilk = in.next().charAt(0);
                    switch (chooserMilk) {
                        case '1':
                            AddIngridients.addMilk();
                            break;
                        case '2':
                            System.out.println("Не добавляем молоко. Начинаем процесс варки.");
                            break;
                        default:
                            System.out.println("Выберите одно из предложенных выше значений.");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Кофе машина выключена.");
                    System.exit(0);
                default:
                    System.out.println("Выберите одно из предложенных выше значений.");
                    break;
            }

        }
    }
}
