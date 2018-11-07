package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;


public class Program {

    public static MobilniBroj unosMobilnog() {
        Scanner ulaz = new Scanner(System.in);
        String s = ulaz.nextLine();
        int mobilnaMreza = ulaz.nextInt();
        MobilniBroj mobilniBroj = new MobilniBroj(mobilnaMreza, s);
        return mobilniBroj;
    }

    public static FiksniBroj unosFiksnog(){
        Scanner ulaz = new Scanner(System.in);
        String s = ulaz.nextLine();
        String redniBrojGrada = ulaz.nextLine();
        FiksniBroj fiksniBroj = new FiksniBroj(FiksniBroj.Grad.valueOf(redniBrojGrada), s);
        return fiksniBroj;
    }

    public static MedunarodniBroj unosMedjunarodnog() {
        Scanner ulaz = new Scanner(System.in);
        String s = ulaz.nextLine();
        String drzava = ulaz.nextLine();
        MedunarodniBroj medunarodniBroj = new MedunarodniBroj(drzava, s);
        return medunarodniBroj;
    }

    public static void main(String[] args) {
        Imenik imenik = new Imenik();

        Scanner ulaz = new Scanner(System.in);

        System.out.println("Izaberite opciju koju zelite : \n" + "1- Ddodaj fiksni broj u imenik: \n" + "2- Dodaj mobilni broji: \n" + "3- Dodaj medjundarodni broj: \n " + "-1 za izlaz");
        int i;
        do {
            i = ulaz.nextInt();
            if (i == 1) {
                FiksniBroj fiksniBroj = unosFiksnog();
                Scanner ulaz2 = new Scanner(System.in);
                String ime = ulaz2.nextLine();
                imenik.dodaj(ime,fiksniBroj);
            } else if (i == 2) {
                MobilniBroj mobilniBroj = unosMobilnog();
                Scanner ulaz2 = new Scanner(System.in);
                String ime = ulaz2.nextLine();
                imenik.dodaj(ime,mobilniBroj);
            } else if (i == 3) {
                MedunarodniBroj medunarodniBroj = unosMedjunarodnog();
                Scanner ulaz2 = new Scanner(System.in);
                String ime = ulaz2.nextLine();
                imenik.dodaj(ime,medunarodniBroj);
            }
        } while (i != -1);
        System.out.println("Izaberite opciju koju zelite : \n" + "1- Zelite grad pozivnog broja: \n" + "2- Zelite drazavu pozivnog \n" + "-1 - za izlaz");
        int k;
        do {
            k = ulaz.nextInt();
            if (k == 1) {
                FiksniBroj fiksniBroj = unosFiksnog();
                String s = new String();
                s = fiksniBroj.getPozivniGrada();
                System.out.println(s);
            } else if (k == 2) {
                MedunarodniBroj medunarodniBroj = unosMedjunarodnog();
                String s = new String();
                s = medunarodniBroj.getDrzava();
                System.out.println(s);
            }
        } while (k != -1);
        System.out.println("Unesite prvo slovo od kojeg zelite telefonske brojeve");
        Scanner ulaz3 = new Scanner(System.in);
        char slovo=ulaz3.next().charAt(0);
        String s= imenik.naSlovo(slovo);
        System.out.println(s);

    }
    }
