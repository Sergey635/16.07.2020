package com.company;

public class Main {

    public static void main(String[] args) {
	    String palindrom = "Води, Сахара, хасидов";
	    String buffer = palindrom.toLowerCase();   //(нижній регістр) переводить великі букви на маленькі
        System.out.println(buffer);
        buffer = buffer.replaceAll(" " , "");   // replaceAll   заміняює вказані символи на інші вказані
        buffer = buffer.replaceAll(",","");
        System.out.println(buffer);
        String backword = "";       //всі перемінні повині мати правильні назви
        //GUI - Graphic User Interface - FrontEnd


        for (int i = buffer.length()-1; i >=0 ; i--) {
            backword+=buffer.charAt(i);



        }
        System.out.println(backword);

        boolean result = backword.equals(buffer);           //equals - означає рівний
        System.out.println(result);
    }
}
