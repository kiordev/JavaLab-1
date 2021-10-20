package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

/*
* Лабораторная работа №1 студента группы ВТ-19 (2021)
*
* Дисциплина: Кросс-платформенное программирование на Java
*
* Александр Киор, Мариуполь 2021
 */



public class Main {

    static void Task_One(){
//Обслуживание меню
        int user_choose = 0; //Переменная для управления пунктами меню
        Scanner user_val = new Scanner(System.in);

        boolean ProgrammIsWork = true; //Переменная для бесконечного цикла
        //Обслуживание меню

        //Начало псевдо UI
        System.out.println("Калькулятор");
        System.out.println("---------------");
        while(ProgrammIsWork = true){
            System.out.println("Меню:");
            System.out.println("1 - Арифметические операции");
            System.out.println("2 - Побитовые операции");
            System.out.println("Введите действие: ");
            user_choose = user_val.nextInt();
            //Конец псевдо UI


            if(user_choose == 1){ //Арифметика
                int value_1;
                Scanner value_1_enter = new Scanner(System.in);
                int value_2;
                Scanner value_2_enter = new Scanner(System.in);
                int plus_result;
                int minus_result;
                int mult_result;
                double dill_result;
                System.out.println("Введите первое число: ");
                value_1 = value_1_enter.nextInt();
                System.out.println("Введите второче число: ");
                value_2 = value_2_enter.nextInt();

                //Просчитывание результатов операции
                plus_result = value_1+value_2;
                minus_result = value_1-value_2;
                mult_result = value_1*value_2;
                dill_result = value_1/value_2;
                //Просчитывание результатов операции
                //Таблица вывода
                System.out.println("Таблица результатов:");
                System.out.println("----------------------");
                System.out.println("Сложение: "+ plus_result);
                System.out.println("Вычитание: "+ minus_result);
                System.out.println("Умножение: "+ mult_result);
                System.out.println("Деление: "+ dill_result);
                System.out.println("----------------------");
                System.out.println("Первый декремент | post: "+ value_1++);
                System.out.println("Первый декремент | pre: "+ ++value_1);
                System.out.println("Первый инкремент | post: "+ value_1--);
                System.out.println("Первый инкремент | post: "+ --value_1);
                System.out.println("----------------------");
                System.out.println("Второй декремент | post: "+ value_2++);
                System.out.println("Второй декремент | pre: "+ ++value_2);
                System.out.println("Второй инкремент | post: "+ value_2--);
                System.out.println("Второй инкремент | post: "+ --value_2);
                System.out.println("----------------------");
                //Таблица вывода

            }

            else if(user_choose == 2) { //Побитовые операции
                //Ввод логических переменных
                boolean logical_value_one;
                Scanner log_val_one = new Scanner(System.in);
                boolean logical_value_two;
                Scanner log_val_two = new Scanner(System.in);

                boolean logical_or_result = false;
                boolean logical_and_result = false;
                boolean logical_and_inverse = false;

                System.out.println("Введите первое лог. значение: ");
                logical_value_one = log_val_one.nextBoolean();
                System.out.println("Введите второе лог. значение: ");
                logical_value_two = log_val_two.nextBoolean();
                //Вычисление логических операций
                //Логическое ИЛИ
                if (logical_value_one == true || logical_value_two == true) {
                    logical_or_result = true;
                } else if (logical_value_one == false && logical_value_two == false) {
                    logical_or_result = false;
                }
                //Логическое И
                if (logical_value_one == true && logical_value_two == true) {
                    logical_and_result = true;
                } else {
                    logical_and_result = false;
                }
                //Логическое исключающее ИЛИ
                if(logical_value_one == logical_value_two){
                    logical_and_inverse = false;
                }
                else{
                    logical_and_inverse = true;
                }

                //Таблица вывода
                System.out.println("Таблица результатов:");
                System.out.println("----------------------");
                System.out.println("Логическое И: " + logical_and_result);
                System.out.println("Логическое ИЛИ: " + logical_or_result);
                System.out.println("Логическое НЕ: " + !logical_and_result +" "+ !logical_or_result);
                System.out.println("Логическое исключающее ИЛИ: " + logical_and_inverse);

                System.out.println("----------------------");
                //Таблица вывода


            }
            else {
                System.out.println("Ошибка: Введите верное значение");
            }
        }
    } //Первое задание
    static void Task_Two(){
        System.out.println("Задание №2");
        int[] three_val_massive = new int[3]; //Выделенный массив под целые числа
        Scanner arrays_val_enter = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");

        int middle_num = 0; //Среднее арифметическое

        for(int i = 0; i< three_val_massive.length; i++){ //Цикл для ввода чисел в массив
            three_val_massive[i] = arrays_val_enter.nextInt();
            middle_num += three_val_massive[i];
        }

        middle_num=middle_num/3; //Вычисление среднего арифметического

        System.out.print("Ваш массив: "); //Цикл для вывода массива
        for(int i = 0; i< three_val_massive.length; i++){
           System.out.print(three_val_massive[i]+ " ");
        }
        System.out.println("");

        int max_array_value = 0;

        for(int i = 0; i<three_val_massive.length;i++){ //Цикл для нахождения большего числа
            if(three_val_massive[i]>max_array_value){
                max_array_value = three_val_massive[i];
            }

        }
        System.out.println("Максимальное введенное число: "+max_array_value);
        System.out.println("Среднее арифметическое чисел: " +middle_num);


    } //Второе задание
    static void Task_Three(){
        System.out.println("Задание №3");
        //Активация рандома
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        //Активация рандома

        int simple_counter = 0;
        int dill_of_three_counter = 0;

        int[] hundred_array = new int[100];

        for(int i = 0; i< hundred_array.length;i++){ //Заполнение массива числами
            hundred_array[i] = random.nextInt(diff + 1) + min;
        }
        System.out.println("Сгенерированный массив: ");
        for(int i = 0; i< hundred_array.length;i++){ //Заполнение массива числами
            System.out.print(hundred_array[i] +" ");
        }
        System.out.println("");
        System.out.println("-------------");
        Arrays.sort(hundred_array); //Метод класса Arrays для сортировки
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i< hundred_array.length;i++){ //Заполнение массива числами
            System.out.print(hundred_array[i] +" ");
        }


        int i, j, p; //Алгоритм для нажождения всех простых чисел в списке

        System.out.print("All prime numbers are:");

        for (i = 0; i < hundred_array.length; i++) {
            j = 2;
            p = 1;
            while (j < hundred_array[i]) {
                if (hundred_array[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                simple_counter++;
            }
        }

        for(int count = 0; count < hundred_array.length; count++){
            if(hundred_array[i]%3==0){
                dill_of_three_counter++;
            }
        }

        System.out.println("");
        System.out.println("-------------");
        System.out.println("Количество простых чисел:" +simple_counter);
        System.out.println("Количество чисел кратных 3: " + dill_of_three_counter);





    } //Третье задание
    public static void main(String[] args) {
        int global_user_choose = 0; //Глобальная переменная для выбора
        Scanner global_user = new Scanner(System.in);

        System.out.println("Лабораторная работа №1");
        boolean ProgramWorking = true;
        while(ProgramWorking == true){
            System.out.println("---------------------");
            System.out.println("1 - Первое задание");
            System.out.println("2 - Второе задание");
            System.out.println("3 - Третье задание");
            System.out.println("Введите номер задания: ");
            global_user_choose = global_user.nextInt();

            if(global_user_choose == 1 ){
                Task_One();
            }
            else if(global_user_choose == 2){
                Task_Two();
            }
            else if(global_user_choose == 3){
                Task_Three();
            }
            else{
                System.out.println("Ошибка, введите верное значение");
            }
        }




    }


}
