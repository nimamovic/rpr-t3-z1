package ba.unsa.etf.rpr.tutorijal03;


public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String medunarodniBroj;

    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.medunarodniBroj=broj;
    }

    @Override
    public String ispisi(){
        String ispis=new String();
        ispis+=drzava+medunarodniBroj;
        return ispis;
    }

    @Override
    public int hashCode() {
        return drzava.hashCode()+medunarodniBroj.hashCode();
    }
}
