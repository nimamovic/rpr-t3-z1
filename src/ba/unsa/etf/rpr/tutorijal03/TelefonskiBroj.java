package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {

	public abstract String ispisi();

	@Override
	public abstract int hashCode();

	@Override
	public int compareTo(TelefonskiBroj t){
		return this.ispisi().compareTo(t.ispisi());
	}

}
