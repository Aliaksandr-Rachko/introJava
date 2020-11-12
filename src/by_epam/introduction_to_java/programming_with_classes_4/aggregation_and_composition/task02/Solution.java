package by_epam.introduction_to_java.programming_with_classes_4.aggregation_and_composition.task02;

/*
 * Условие задачи:
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Solution {
    public static void main(String[] args) {
        // создаем объект автомобиль
        Car car = new Car();

        // вызываем метод ехать
        car.go();

        // вызвваем метод заправляться
        car.refuel();

        // менять колесо
        car.changeWheel(new Wheel());

        // выводим на консоль марку автомобиля
        car.modelToString();
    }
}
