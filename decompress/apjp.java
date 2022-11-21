import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjp extends ahcz implements aheo
{
    private static final apjp a;
    private static volatile ahev b;
    private int c;
    private apjq d;
    private int e;
    private String f;
    private int g;
    private int h;
    private int i;
    private String j;
    private int k;
    private String l;
    private long m;
    private int n;
    private int o;
    private long p;
    private long q;
    private long r;
    private long s;
    private ahdp t;
    private apjm u;
    private apjx v;
    private String w;
    private String x;
    
    static {
        ahcz.registerDefaultInstance(apjp.class, a = new apjp());
    }
    
    private apjp() {
        this.f = "";
        this.j = "";
        this.l = "";
        this.t = ahcz.emptyProtobufList();
        this.w = "";
        this.x = "";
    }
    
    private void A(final apkf apkf) {
        this.e = apkf.bz;
        this.c |= 0x2;
    }
    
    private void B(final apkh apkh) {
        this.h = apkh.aD;
        this.c |= 0x4000;
    }
    
    private void C(final apki apki) {
        this.g = apki.S;
        this.c |= 0x2000;
    }
    
    private void D(final long m) {
        this.c |= 0x80000;
        this.m = m;
    }
    
    private void E(final apjm u) {
        u.getClass();
        this.u = u;
        this.c |= 0x40000000;
    }
    
    private void F(final apjz apjz) {
        this.n = apjz.d;
        this.c |= 0x100000;
    }
    
    private void G(final apke apke) {
        this.k = apke.k;
        this.c |= 0x20000;
    }
    
    private void H(final apjq d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    private void I(final String l) {
        this.c |= 0x40000;
        this.l = l;
    }
    
    private void J(final apjx v) {
        v.getClass();
        this.v = v;
        this.c |= Integer.MIN_VALUE;
    }
    
    public static apjo a() {
        return (apjo)apjp.a.createBuilder();
    }
    
    static apjp b() {
        return apjp.a;
    }
    
    public static void c(final apjp apjp, final apjq apjq) {
        apjp.H(apjq);
    }
    
    public static void d(final apjp apjp, final apkf apkf) {
        apjp.A(apkf);
    }
    
    public static void e(final apjp apjp, final apki apki) {
        apjp.C(apki);
    }
    
    public static void f(final apjp apjp, final apkh apkh) {
        apjp.B(apkh);
    }
    
    public static void g(final apjp apjp, final apka apka) {
        apjp.z(apka);
    }
    
    public static void h(final apjp apjp, final String s) {
        apjp.u(s);
    }
    
    public static void i(final apjp apjp, final apke apke) {
        apjp.G(apke);
    }
    
    public static void j(final apjp apjp, final String s) {
        apjp.I(s);
    }
    
    public static void k(final apjp apjp, final long n) {
        apjp.D(n);
    }
    
    public static void l(final apjp apjp, final apjz apjz) {
        apjp.F(apjz);
    }
    
    public static void m(final apjp apjp, final apkg apkg) {
        apjp.t(apkg);
    }
    
    public static void n(final apjp apjp, final long n) {
        apjp.v(n);
    }
    
    public static void o(final apjp apjp, final long n) {
        apjp.w(n);
    }
    
    public static void p(final apjp apjp, final long n) {
        apjp.y(n);
    }
    
    public static void q(final apjp apjp, final long n) {
        apjp.x(n);
    }
    
    public static void r(final apjp apjp, final apjm apjm) {
        apjp.E(apjm);
    }
    
    public static void s(final apjp apjp, final apjx apjx) {
        apjp.J(apjx);
    }
    
    private void t(final apkg apkg) {
        this.o = apkg.r;
        this.c |= 0x200000;
    }
    
    private void u(final String j) {
        j.getClass();
        this.c |= 0x10000;
        this.j = j;
    }
    
    private void v(final long p) {
        this.c |= 0x400000;
        this.p = p;
    }
    
    private void w(final long q) {
        this.c |= 0x800000;
        this.q = q;
    }
    
    private void x(final long s) {
        this.c |= 0x2000000;
        this.s = s;
    }
    
    private void y(final long r) {
        this.c |= 0x1000000;
        this.r = r;
    }
    
    private void z(final apka apka) {
        this.i = apka.o;
        this.c |= 0x8000;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apjp.b) == null) {
                    synchronized (apjp.class) {
                        if (apjp.b == null) {
                            apjp.b = (ahev)new ahcs((ahcz)apjp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjp.a;
            }
            case 4: {
                return new apjo();
            }
            case 3: {
                return new apjp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjp.a, "\u0001\u0011\u0000\u0001\u0001-\u0011\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\r\u100c\r\u000e\u100c\u000e\u000f\u100c\u0011\u0010\u1008\u0012\u0011\u1003\u0013\u0012\u100c\u0014\u0013\u100c\u0015\u0015\u1003\u0016\u0016\u1003\u0017\u0017\u1003\u0018\u0018\u1003\u0019\u001e\u1009\u001f\"\u100c\u000f,\u1009\u001e-\u1008\u0010", new Object[] { "c", "d", "e", apkf.a(), "g", apki.a(), "h", apkh.a(), "k", apke.a(), "l", "m", "n", apjz.a(), "o", apkg.a(), "p", "q", "r", "s", "v", "i", apka.a(), "u", "j" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
