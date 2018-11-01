package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa= new HashMap<>();

    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.putIfAbsent(ime,broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        String ime= new String();
        for(Map.Entry<String, TelefonskiBroj> e: mapa.entrySet()){
            if(e.getValue()==broj) ime=e.getKey();
        }
        return ime;
    }

    public String naSlovo(char s){
        String ime= new String();
        String str=new String();
        int i=0;
        for(Map.Entry<String, TelefonskiBroj> e: mapa.entrySet()){
            ime=e.getKey();
            if(ime.charAt(0)==s){
                i++;
                str+=String.valueOf(i+48) + ". " +  e.getKey() + "-" + e.getValue();
            }
        }
        return str;
    }

    Set<String> izGrada(FiksniBroj.Grad g) {

        Set<String> skup = new TreeSet<>();
        String broj= new String();
        String poz=new String();
        poz+="0";
        if(g == Grad.TRAVNIK) poz="30";
        else if(g == Grad.ORASJE) poz="31";
        else if(g == Grad.ZENICA) poz="32";
        else if(g == Grad.SARAJEVO) poz="33";
        else if(g == Grad.LIVNO) poz="34";
        else if(g == Grad.TUZLA) poz="35";
        else if(g == Grad.MOSTAR) poz="36";
        else if(g == Grad.BIHAC) poz="37";
        else if(g == Grad.GORAZDE) poz="38";
        else if(g == Grad.SIROKIBRIJEG) poz="39";
        else if(g == Grad.BRCKO) poz="49";
        for(Map.Entry<String, TelefonskiBroj> e: mapa.entrySet()){
            broj=e.getValue();
            if(broj.charAt(0)==poz.charAt(0))&&broj.charAt(1)==poz.charAt(1)&&broj.charAt(2)==poz.charAt(2)) skup.add(e.getKey());
        }
        return skup;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        return 0;
    }

}