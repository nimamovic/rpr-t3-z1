package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

import java.util.ArrayList;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa= new HashMap<>();


    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.putIfAbsent(ime,broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        String ime=new String();
        for(Map.Entry<String, TelefonskiBroj> e: mapa.entrySet()){
            if(e.getValue()==broj) ime=e.getKey();
        }
        return ime;
    }

    public String naSlovo(char s){
        String ime;
        String str=new String();
        int i=0;
        for(Map.Entry<String, TelefonskiBroj> e: mapa.entrySet()){
            ime=e.getKey();
            if(ime.charAt(0)==s){
                i++;
                str+=i+ ". " +  e.getKey() + " - " + e.getValue().ispisi()+ "\n";
            }
        }
        return str;
    }

    Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skup = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> e : mapa.entrySet()) {
            TelefonskiBroj broj = e.getValue();
            if (broj instanceof FiksniBroj) {
                FiksniBroj broj2 = (FiksniBroj) broj;
                if (broj2.getPozivniGrada().equals(broj2.getPozivniTrazenogGrada(g))) {
                    skup.add(e.getKey());
                }
            }
        }
        List<String> lista = new ArrayList<>(skup);
        Collections.sort(lista);
        return skup;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> skup = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> e : mapa.entrySet()) {
            TelefonskiBroj broj = e.getValue();
            if (broj instanceof FiksniBroj) {
                FiksniBroj broj2 = (FiksniBroj) broj;
                if (broj2.getPozivniGrada().equals(broj2.getPozivniTrazenogGrada(g))) {
                    skup.add(e.getValue());
                }
            }
        }
        return skup;
    }

}