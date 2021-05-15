/*
 * Copyright (c) 2020, Rachko and/or its affiliates. All rights reserved.
 * RACHKO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package by.epam.introductiontojava.basics_of_OOP_5.task05.main;

/*
 * Условие задачи:
 *
 * Задача 5.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * •  Корректно спроектируйте и реализуйте предметную область задачи.
 * •  Для создания объектов из иерархии классов продумайте возможность использования
 *  порождающих шаблонов проектирования.
 * •  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * •  для проверки корректности переданных данных можно применить регулярные выражения.
 * •  Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * •  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 *
 * Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 * (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
 * и упаковка.
 *
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
 * подарок). Составляющими целого подарка являются сладости и упаковка.
 */

import by.epam.introductiontojava.basics_of_OOP_5.task05.view.View;
import by.epam.introductiontojava.basics_of_OOP_5.task05.controller.Controller;
import by.epam.introductiontojava.basics_of_OOP_5.task05.creator.CompositionCreator;
import by.epam.introductiontojava.basics_of_OOP_5.task05.creator.FlowerCreator;
import by.epam.introductiontojava.basics_of_OOP_5.task05.creator.PackCreator;

public class Main {
    public static void main(String[] args) {
        FlowerCreator flowerCreator = new FlowerCreator();
        PackCreator packCreator = new PackCreator();

        CompositionCreator compositionCreator = new CompositionCreator(
                flowerCreator, packCreator);

        Controller controller = new Controller(compositionCreator);

        View view = new View(controller);
        view.action();
    }
}
