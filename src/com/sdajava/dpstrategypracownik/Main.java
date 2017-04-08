package com.sdajava.dpstrategypracownik;

public class Main {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik ("mechanik");
        Pracownik pracownik2 = new Pracownik ("listonosz");
        Pracownik pracownik3 = new Pracownik ("konował");

        pracownik1.execute();
        pracownik2.execute();
        pracownik3.execute();
    }
}
