package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String mobilniBroj;
    private int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilniBroj=broj;
        this.mobilnaMreza=mobilnaMreza;
    }

    @Override
    public String ispisi(){
        String ispis= new String();
        ispis+="0"+mobilnaMreza+"/"+mobilniBroj;
        return ispis;
    }

    @Override
    public int hashCode() {
        return mobilniBroj.hashCode()+mobilnaMreza;
    }

}
