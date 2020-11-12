package by_epam.introduction_to_java.basics_1.cycles.task01;

/*
 * Условие задачи:
 * 1.  Напишите  программу,  где  пользователь  вводит любое  целое  положительное  число.
 *     А  программа  суммирует все числа от 1 до введенного пользователем числа.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sum(Integer.parseInt(reader.readLine())));

        reader.close();
    }

    public static int sum(int x){
        int result = 0;
        for (int i = 1; i < x; i++){
            result += i;
        }
        return result;
    }
}
