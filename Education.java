import java.util.Scanner;

public class Education {

    public static void main(String[] args) {

        // Числа
        int myAge;
        myAge = 33;
        System.out.println(myAge);

        // Числа + текст
        String myName = "Azat";
        System.out.println(myAge + myName);

        // Метод подсчета длины строки
        String dlina = "Azatik";
        int count = dlina.length();
        System.out.println(count);

        // Метод преобразования символов строки в маленькие
        String Little = "AZATIK";
        String Littletxt = Little.toLowerCase();
        System.out.println(Littletxt);

        // Метод преобразования символов строки в большие
        String Big = "Azatik";
        String Bigtext = Big.toUpperCase();
        System.out.println(Bigtext);


        // Условный оператор
        int age = 32;
        if (age<33) {
            System.out.println("Вы младше Азата");
            System.out.println("так что не выебывайся");
        }else{
            System.out.println("Вы ровесник Азата");
        }

        //Инкремент - Декремент
        int keks = 20;
        keks ++;
        keks --;
        System.out.println(keks);

        //Конкатенация - склеивание строк
        String name = "Azat";
        String sex = "Сексуальный";
        System.out.println(name+sex);

        //Преобразование числа в строку (для этого нужно сложить число и пустую строку)
        int azat = 33;
        System.out.println(azat+ " "+33);

        //Преобразование строки в число (для этого используется специальный метод Integer.ParseInt(строка))
        String Zara = "28";
        int number = Integer.parseInt(Zara);
        System.out.println(Zara);

        // True or False - Boolean
        int Azat = 33;
        int Askar = 36;
        System.out.println(Askar>Azat);

        // AND и OR (&& и ||) http://developer.alexanderklimov.ru/android/java/logic_operators.php
        boolean x = true;
        boolean y = true;
        boolean z = false;

        boolean result = x&&y&&z;
        System.out.println(result);

        boolean result2 = x || y || z;
        System.out.println(result2);

        // ! Знак отрицания
        boolean a = true;
        boolean b = false;
        System.out.println(!a); // простыми словами !а не true, нет a это true, значит ответ будет false
        System.out.println(!b); // b не правда, да, b не правда, значит ответ будет true

        int aa = 10;
        int bb = 5;
        boolean cc = aa>bb;
        System.out.println(cc);

        // http://developer.alexanderklimov.ru/android/java/logic_operators.php

        int f = 20;
        int g = 50;
        int h = 200;
        int l = 201;

        boolean i = f<g | ++h==l; // i = 20<50 или 1+200 = 201
        System.out.println(i);














    }


}
