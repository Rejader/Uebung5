public class Wurst extends Speise{

    public Wurst(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean essen() {
        this.menge = this.menge - 10;
        return super.essen();
    }
}
