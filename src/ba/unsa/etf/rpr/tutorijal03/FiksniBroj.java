package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}

    private Grad grad;
    private String brojFiksnog;

    private static String[] pozivni = { "037", "031", "035", "032", "038", "030", "036", "039", "033", "034", "049"};

    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.brojFiksnog=broj;
    }

    public String getPozivniGrada () {
        return pozivni[grad.ordinal()];
    }

    public String getPozivniTrazenogGrada (Grad g) {
        return pozivni[g.ordinal()];
    }

    @Override
    public String ispisi () {
        return pozivni[grad.ordinal()] + "/" + brojFiksnog;
    }

   /* public String ispisi(){
        String ispis=new String();
        ispis+="0";
        if(grad == Grad.TRAVNIK) ispis+="30";
        else if(grad == Grad.ORASJE) ispis+="31";
        else if(grad == Grad.ZENICA) ispis+="32";
        else if(grad == Grad.SARAJEVO) ispis+="33";
        else if(grad == Grad.LIVNO) ispis+="34";
        else if(grad == Grad.TUZLA) ispis+="35";
        else if(grad == Grad.MOSTAR) ispis+="36";
        else if(grad == Grad.BIHAC) ispis+="37";
        else if(grad == Grad.GORAZDE) ispis+="38";
        else if(grad == Grad.SIROKIBRIJEG) ispis+="39";
        else if(grad == Grad.BRCKO) ispis+="49";
        ispis+="/"+brojFiksnog;
        return ispis;
    }
*/
    @Override
    public int hashCode(){
        /*
        String poz=new String();
        if(grad == Grad.TRAVNIK) poz="30";
        else if(grad == Grad.ORASJE) poz="31";
        else if(grad == Grad.ZENICA) poz="32";
        else if(grad == Grad.SARAJEVO) poz="33";
        else if(grad == Grad.LIVNO) poz="34";
        else if(grad == Grad.TUZLA) poz="35";
        else if(grad == Grad.MOSTAR) poz="36";
        else if(grad == Grad.BIHAC) poz="37";
        else if(grad == Grad.GORAZDE) poz="38";
        else if(grad == Grad.SIROKIBRIJEG) poz="39";
        else if(grad == Grad.BRCKO) poz="49";
        return poz.hashCode()+grad.hashCode();
        */
        return brojFiksnog.hashCode();
    }
}
