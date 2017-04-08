package com.sdajava.dpstrategypracownik;

import com.sdajava.dpstrategypracownik.czas.Literatura;
import com.sdajava.dpstrategypracownik.czas.Silka;
import com.sdajava.dpstrategypracownik.czas.WolnyCzas;
import com.sdajava.dpstrategypracownik.dojazd.Dojezdzac;
import com.sdajava.dpstrategypracownik.dojazd.Rower;
import com.sdajava.dpstrategypracownik.dojazd.Samochod;
import com.sdajava.dpstrategypracownik.prac.Leczenie;
import com.sdajava.dpstrategypracownik.prac.NaprawaSamochodow;
import com.sdajava.dpstrategypracownik.prac.Pracowac;
import com.sdajava.dpstrategypracownik.prac.RoznoszenieListow;

public class Pracownik {

    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private WolnyCzas wolnyCzas;

    private String zawod;

    public Pracownik(String zawod) {
        if (zawod.equals("mechanik")) {
            this.pracowac = new NaprawaSamochodow();
            this.dojezdzac = new Samochod();
            this.wolnyCzas = new Silka();
        }
        if (zawod.equals("konowal")) {
            this.pracowac = new Leczenie();
            this.dojezdzac = new Samochod();
            this.wolnyCzas = new Literatura();
        }
        if (zawod.equals("listonosz")) {
            this.pracowac = new RoznoszenieListow();
            this.dojezdzac = new Rower();
            this.wolnyCzas = new Silka();
        }
        this.zawod = zawod;
    }

    public void execute () {
        System.out.println(this.zawod);
        pracowac.pracuj();
        dojezdzac.dojezdzaj();
        wolnyCzas.spedzanieWolnegCzasu();

    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pracowac = " + pracowac +
                ", dojezdza = " + dojezdzac +
                ", wolny czas spedza= " + wolnyCzas +
                ", zawod = '" + zawod + '\'' +
                '}';
    }
}
