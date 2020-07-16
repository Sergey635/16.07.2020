package com.company;

public class Main {

    public static void main(String[] args) {
	    String palindrom = "Води, Сахара, хасидов";
	    String buffer = palindrom.toLowerCase();   //(нижній регістр) переводить великі букви на маленькі
        System.out.println(buffer);
        buffer = buffer.replaceAll(" " , "");   // replaceAll   заміняює вказані символи на інші вказані
        buffer = buffer.replaceAll(",","");
        System.out.println(buffer);
        String backword = "";       //всі перемінні повині мати правильні назви,
                                    // всі починаються з малої букви,
        //GUI - Graphic User Interface - FrontEnd


        for (int i = buffer.length()-1; i >=0 ; i--) {
            backword+=buffer.charAt(i);



        }
        System.out.println(backword);

        boolean result = backword.equals(buffer);           //equals - означає рівний
        System.out.println(result);


        int[] arrey = new int[5];           //задали массив з 5-и елементів
        arrey[0] = 10;
        arrey[1] = 2;
        arrey[2] = 3;
        arrey[3] = 40;
        arrey[4] = 50;          //масив набили значеннями

        for (int i = 0; i < arrey.length ; i++) {
        /*    System.out.println(arrey[i]);*/
            if(arrey[i] >= 10){
                System.out.println(arrey[i]);
            }

            int ageOffMyFriend; //це називається CamelCase !!!!


            int areaOfMyGarden;  //джава-конвеншн
        }





    }
}
