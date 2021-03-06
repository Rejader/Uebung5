public class Speise extends Lebensmittel {

    public Speise(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean essen() {
        if(menge < 0) {
            menge = 0;
            return false;
        }
        return true;
    }

    @Override
    public boolean trinken() {
        return false;
    }

    @Override
    public String status() {
        return super.status() + "g";
    }

    public void essen(int menge) {
        this.menge = this.menge - menge;
    }
}
