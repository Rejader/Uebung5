public class Getraenk extends Lebensmittel {

    public Getraenk(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean essen() {
        return false;
    }

    @Override
    public boolean trinken() {
        if(menge < 0) {
            menge = 0;
            return false;
        }
        return true;
    }

    @Override
    public String status() {
        return super.status() + "ml";
    }

    public void trinken(int menge) {
        this.menge = this.menge - menge;
    }
}
