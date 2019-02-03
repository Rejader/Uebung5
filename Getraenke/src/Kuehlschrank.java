public class Kuehlschrank {

    protected Lebensmittel[] kuehlschrank;
    protected int fuellstand;

    public Kuehlschrank(int size) {
        kuehlschrank = new Lebensmittel[size];
        fuellstand = 0;
    }

    public void einkaufen() {
        kuehlschrank[fuellstand++] = (new Mate("Club Mate"));
        kuehlschrank[fuellstand++] = (new Brot(1, 750));
        kuehlschrank[fuellstand++] = (new Wasser("Sprudel", 330));
        kuehlschrank[fuellstand++] = (new Mate("Flora Power"));
        kuehlschrank[fuellstand++] = (new Brot(3, 1000));
        kuehlschrank[fuellstand++] = (new Wurst("Soja Spezial", 100));
        kuehlschrank[fuellstand++] = (new Wasser("Still", 2000));
        //TODO remove
        kuehlschrank[fuellstand++] = (new Wasser("MarkoBla0", 201));
        kuehlschrank[fuellstand++] = (new Wasser("MarkoBla1", 200));
        kuehlschrank[fuellstand++] = (new Wasser("MarkoBla2", 199));
    }

    public void auflisten() {
        for (int i = 0; i < fuellstand; i++) {
            System.out.println(kuehlschrank[i].status());
        }
    }

    public void verbrauchen() {
        for (int i = 0; i < fuellstand; i++) {
            if (kuehlschrank[i].essen()) {
                System.out.println("Essen: " + kuehlschrank[i].status());
            }
            if (kuehlschrank[i].trinken()) {
                System.out.println("Trinken: " + kuehlschrank[i].status());

            }
        }
    }
}
