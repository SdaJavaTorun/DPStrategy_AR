package com.sdajava.dpstrategypracownik;

import com.sdajava.dpstrategypracownik.czas.Literatura;
import com.sdajava.dpstrategypracownik.czas.Silka;
import com.sdajava.dpstrategypracownik.czas.WolnyCzas;
import com.sdajava.dpstrategypracownik.dojazd.Dojezdzac;
import com.sdajava.dpstrategypracownik.dojazd.Rower;
import com.sdajava.dpstrategypracownik.dojazd.Samochow;
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
        if (zawod == "mechanik")
            this.dojezdzac = new Samochow();
            this.pracowac = new NaprawaSamochodow();
            this.wolnyCzas = new Silka();
        if (zawod == "konowal")
            this.pracowac = new Leczenie();
            this.dojezdzac = new Samochow();
            this.wolnyCzas = new Literatura();
        if (zawod == "listonosz")
            this.pracowac = new RoznoszenieListow();
            this.dojezdzac = new Rower();
            this.wolnyCzas = new Silka();
        this.zawod = zawod;
    }

    public String getPracowac() {
        return pracowac.toString();
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public String getDojezdzac() {
        return dojezdzac.toString();
    }

    public void setDojezdzac(Dojezdzac dojezdzac) {
        this.dojezdzac = dojezdzac;
    }

    public WolnyCzas getWolnyCzas() {
        return wolnyCzas;
    }

    public void setWolnyCzas(WolnyCzas wolnyCzas) {
        this.wolnyCzas = wolnyCzas;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pracowac=" + pracowac +
                ", dojezdzac=" + dojezdzac +
                ", wolnyCzas=" + wolnyCzas +
                ", zawod='" + zawod + '\'' +
                '}';
    }
}
