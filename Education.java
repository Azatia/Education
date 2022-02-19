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











    }


}
