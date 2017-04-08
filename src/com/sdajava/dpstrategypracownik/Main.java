package com.sdajava.dpstrategypracownik;

public class Main {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik ("mechanik");
        Pracownik pracownik2 = new Pracownik ("listonosz");
        Pracownik pracownik3 = new Pracownik ("konował");

        System.out.println(pracownik1.getZawod() + " dojeżdża "
                + pracownik1.getDojezdzac() + " wolny czas: "
                + pracownik1.getWolnyCzas() + " pracuje jako:" + pracownik1.getPracowac());

        System.out.println(pracownik2.getZawod() + " dojeżdża "
                + pracownik2.getDojezdzac() + " wolny czas: "
                + pracownik2.getWolnyCzas() + " pracuje jako:" + pracownik2.getPracowac());
    }
}
