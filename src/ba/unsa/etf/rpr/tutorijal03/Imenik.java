package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa=new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime,broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        return "";
    }

    public String naSlovo(char s){
        return "";
    }

    Set<String> izGrada(FiksniBroj.Grad g){

    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){

    }

}