public class Wasser extends Getraenk {

    public Wasser(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean trinken() {
        this.menge = this.menge - 200;
        return super.trinken();
    }
}
