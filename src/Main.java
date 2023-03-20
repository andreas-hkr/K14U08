public class Main {
    public static void main(String[] args) {
        // Utgå från föregående uppgift och se till att talet efter ändring inte har
        // några gemensamma faktorer i täljaren och nämnaren.
        //
        // Tips: Uppgift 13.4 kan vara till stor hjälp...

        RatNum r1 = new RatNum();
        r1.p = 2;
        r1.q = 10;

        RatNum r2 = new RatNum();
        r2.p = 3;
        r2.q = 10;

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

        int x = gcd(p, q);
        p /= x;
        q /= x;
    }

    void add(RatNum r) {
        p = p * r.q + r.p * q;
        q = q * r.q;

        int x = gcd(p, q);
        p /= x;
        q /= x;
    }

    int gcd(int m, int n) {
        while (true) {
            int r = m % n;
            if (r == 0) {
                break;
            }
            m = n;
            n = r;
        }
        return n;
    }
}