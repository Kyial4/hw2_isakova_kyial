package com.company;

import java.util.Random;

public class Main {
public static String Option = "Можно идти гулять";
public static String Option2 = "Оставайтесь дома";

    public static void main(String[] args) {
	// write your code here
        System.out.println(Abc(25,28));
        System.out.println(Abc(45,-10));
        System.out.println(Abc(60,30));
        System.out.println(Abc(30,25));
        System.out.println(Abc(12,30));
        System.out.println(Abc(GenerateRandomAge(),26));
    }
    public static String Abc(int age, int temperature){
        if (age >20 && age<45&&temperature>-20&& temperature<30){
            return Option;

        }
        else if (age<20&&temperature>0&&temperature<28){
            return Option;
        }
        else if (age>45&&temperature>-10&&temperature<25){
            return Option;
        }
        else{
            return Option2;
        }
    }
    public static int GenerateRandomAge(){
        Random random = new Random();
        int Age = random.nextInt(100);
        return Age;
    }
}
