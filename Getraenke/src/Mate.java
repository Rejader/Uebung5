public class Mate extends Getraenk {

    public Mate(String name) {
        super(name, 500);
    }

    @Override
    public boolean trinken() {
        this.menge = this.menge - 100;
        return super.trinken();
    }
}
