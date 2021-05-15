package by.epam.introductiontojava.tasks_6.task01.main;

/*
 * Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
 * Общие требования к заданию:
 * • Система учитывает книги как в электронном, так и в бумажном варианте.
 * • Существующие роли: пользователь, администратор.
 * • Пользователь может просматривать книги в каталоге книг, осуществлять поиск
 *   книг в каталоге.
 *
 * • Администратор может модифицировать каталог.
 * • * При добавлении описания книги в каталог оповещение о ней рассылается на
 *     e-mail всем пользователям
 * • ** При просмотре каталога желательно реализовать постраничный просмотр
 * • *** Пользователь может предложить добавить книгу в библиотеку, переслав её
 *       администратору на e-mail.
 * • Каталог книг хранится в текстовом файле.
 * • Данные аутентификации пользователей хранятся в текстовом файле. Пароль
 *   не хранится в открытом виде
 */

import by.epam.introductiontojava.tasks_6.task01.utils.BookDao;
import by.epam.introductiontojava.tasks_6.task01.controller.Controller;
import by.epam.introductiontojava.tasks_6.task01.entity.book.Book;
import by.epam.introductiontojava.tasks_6.task01.entity.user.User;
import by.epam.introductiontojava.tasks_6.task01.loader.DataLoader;
import by.epam.introductiontojava.tasks_6.task01.utils.UserDao;

public class Main {
    public static void main(String[] args) {
        DataLoader<User> userDataLoader = new DataLoader<>(
                "./src/main/java/by/epam/introductiontojava/tasks_6/task01/resources/users.txt"
        );

        UserDao userDao = new UserDao(userDataLoader);

        DataLoader<Book> bookDataLoader = new DataLoader<>(
                "./src/main/java/by/epam/introductiontojava/tasks_6/task01/resources/books.txt"
        );

        BookDao bookDao = new BookDao(bookDataLoader);

        Controller controller = new Controller(userDao, bookDao);

        controller.start();

        // userName   password
        // admin      qwerty1234
        // user       1234
    }

}
