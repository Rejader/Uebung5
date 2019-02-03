class Base {

    protected String s = "base";
    protected String t = "base2";

    public String s() {
        return s;
    }

    public String t() {
        return t;
    }
}

class Derived extends Base {

    protected String s = "derived";
    protected String t = "derived2";

    public Derived() {
    }

    public String s() {
        return s;
    }
}

public class PolyTest {

    static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        out(d.s);
        Base b = d;
        out(b.s);
        out(d.s());
        out(b.s());
        out(d.t());
        out(b.t());
    }
}
