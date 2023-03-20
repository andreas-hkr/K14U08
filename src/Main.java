public class Main {
    public static void main(String[] args) {
        // Utgå från föregående uppgift och se till att talet efter ändring inte har
        // några gemensamma faktorer i täljaren och nämnaren.
        //
        // Tips: Uppgift 13.4 kan vara till stor hjälp...

        RatNum r1 = new RatNum();
        r1.p = 2;
        r1.q = 3;

        RatNum r2 = new RatNum();
        r2.p = 2;
        r2.q = 7;

        r1.add(r2);

        System.out.format("%d/%d", r1.p, r1.q);
    }
}

class RatNum {
    // p / q
    int p;
    int q;

    void mul(RatNum r) {
        p = p * r.p;
        q = q * r.q;
    }

    void add(RatNum r) {
        p = p * r.q + r.p * q;
        q = q * r.q;
    }
}