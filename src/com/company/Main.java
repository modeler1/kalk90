package com.company;

import javax.swing.text.View;
import java.util.Scanner;

public class Main {

    static int rezult1;
    static int rezult2;
    static int result;
    static String status;
    static int metka = 0;
    static String first1;
    static String second1;
    static String operator1;

    private static Scanner vvod;

//    double first;
//    double second;
//    String operator;

    public static void main(String[] args) {
	// write your code here


        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String vvod = in.nextLine();

        char first = vvod.charAt(0);
        char second = vvod.charAt(2);
        char operator = vvod.charAt(1);

        first1 = String.valueOf(first);
        second1 = String.valueOf(second);
        operator1 = String.valueOf(operator);

        System.out.println(first1);
        System.out.println(second1);
        System.out.println(operator1);

        if (second1 == "*")
        {
            umnoshenie();
        }
        if (second1 == "+")
        {
            plus();
        }
        if (second1 == "-")
        {
            minus();
        }
        if (second1 == "/")
        {
            delenie();
        }


    }

    public static void plus()
    {
        status = "plus";
        proverkaTexta();


    }
    public static void minus()
    {
        status = "minus";
        proverkaTexta();


    }
    public static void umnoshenie()
    {
        status = "umnoshenie";
        proverkaTexta();


    }
    public static void delenie()
    {
        status = "delenie";
        proverkaTexta();

    }

    static void resultat()
    {

        if (metka == 1)
        {
            System.out.println(String.valueOf(result));
        }
        if (metka == 2)
        {
            String resultSTR = String.valueOf(result);
            if (resultSTR.length() <= 2 )
            {
                char resultSTRvn1 = resultSTR.charAt(0);
                char resultSTRvn2 = resultSTR.charAt(1);
                String resultSTRvnn1 = letterToNumber(resultSTRvn1);
                String resultSTRvnn2 = letterToNumber(resultSTRvn2);
                String resultStRACT = resultSTRvnn1 + resultSTRvnn2;
                System.out.println(String.valueOf(result));
            }
            if (resultSTR.length() == 3 )
            {
                System.out.println("C");
            }


        }


    }

    static void proverkaTexta()
    {
        String rezult1_check = first1;
        String rezult2_check  = second1;

        if (rezult1_check.length() < 1 || rezult2_check.length() < 1) {
            System.out.println("Введите значения!");
        }
        else if (rezult1_check.length() > 10 || rezult2_check.length() > 10)
        {
            System.out.println("Необходимо чтобы каждое число не было больше 10ти");
        }
        else
        {
            switch (status) {
                case  ("plus"):
                    try{
                        rezult1 = Integer.parseInt(first1);
                        rezult2 = Integer.parseInt(second1);
                        metka = 1;
                    } catch (NumberFormatException e) {
                        rezult1 = Roman.valueOf(first1).toInt();
                        rezult2 = Roman.valueOf(second1).toInt();
                        metka = 2;
                    }
                    result = rezult1 + rezult2;
                    resultat();
                    break;
                case ("minus"):
                    try{
                        rezult1 = Integer.parseInt(first1);
                        rezult2 = Integer.parseInt(second1);
                        metka = 1;
                    } catch (NumberFormatException e) {
                        rezult1 = Roman.valueOf(first1).toInt();
                        rezult2 = Roman.valueOf(second1).toInt();
                        metka = 2;
                    }
                    result = rezult1 - rezult2;
                    resultat();
                    break;
                case ("umnoshenie"):
                    try{
                        rezult1 = Integer.parseInt(first1);
                        rezult2 = Integer.parseInt(second1);
                        metka = 1;
                    } catch (NumberFormatException e) {
                        rezult1 = Roman.valueOf(first1).toInt();
                        rezult2 = Roman.valueOf(second1).toInt();
                        metka = 2;
                    }
                    result = rezult1 * rezult2;
                    resultat();
                    break;
                case ("delenie"):
                    try{
                        rezult1 = Integer.parseInt(first1);
                        rezult2 = Integer.parseInt(second1);
                        metka = 1;
                    } catch (NumberFormatException e) {
                        rezult1 = Roman.valueOf(first1).toInt();
                        rezult2 = Roman.valueOf(second1).toInt();
                        metka = 2;
                    }
                    result = rezult1 / rezult2;
                    resultat();
                    break;
            }

        }

    }


    public enum Roman {
        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), IIX(8), IX(9), X(10),;
        private final int value;
        private Roman(int value) {
            this.value = value;
        }
        public int toInt() {
            return value;
        }
    }


    private static String letterToNumber(int letter){
        switch (letter) {
            case 1:  return "I";
            case 2:  return "II";
            case 3:  return "III";
            case 4:  return "IV";
            case 5:  return "V";
            case 6:  return "VI";
            case 7:  return "VII";
            case 8:  return "IIX";
            case 9:  return "IX";
            case 10:  return "X";
            default:   return "C";
        }
    }
}
