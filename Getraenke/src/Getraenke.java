public class Brot extends Speise {

    public Brot(Integer number, int menge) {
        super(getName(number.intValue()), menge);
    }

    @Override
    public boolean essen() {
        this.menge = this.menge - 50;
        return super.essen();
    }

    private static String getName(int i) {
        String name = "Spezialbrot";
        switch (i) {
            case 0:
                name = "Weissbrot";
                break;
            case 1:
                name = "Schwarzbrot";
                break;
            case 2:
                name = "Mischbrot";
                break;
        }
        return name;
    }
}