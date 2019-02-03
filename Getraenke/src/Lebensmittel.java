public abstract class Lebensmittel {

    protected String name;
    protected int menge;

    public Lebensmittel(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    public abstract boolean essen();
    public abstract boolean trinken();

    public String status() {
        return "Klasse: " + this.getClass().getName() +
                " Instance: " + this.name +
                " Menge: " + this.menge;
    }
}
