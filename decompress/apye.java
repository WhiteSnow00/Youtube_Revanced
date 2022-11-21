import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apye extends ahcz implements aheo
{
    private static final apye a;
    private static volatile ahev b;
    private int c;
    private int d;
    private long e;
    private String f;
    private int g;
    private int h;
    private long i;
    private int j;
    private String k;
    
    static {
        ahcz.registerDefaultInstance(apye.class, a = new apye());
    }
    
    private apye() {
        this.f = "";
        this.k = "";
    }
    
    public static apyd a() {
        return (apyd)apye.a.createBuilder();
    }
    
    static apye b() {
        return apye.a;
    }
    
    public static void c(final apye apye, final apyf apyf) {
        apye.r(apyf);
    }
    
    public static void d(final apye apye, final int n) {
        apye.o(n);
    }
    
    public static void e(final apye apye, final int n) {
        apye.p(n);
    }
    
    public static void f(final apye apye, final long n) {
        apye.m(n);
    }
    
    public static void g(final apye apye, final apyg apyg) {
        apye.q(apyg);
    }
    
    public static void h(final apye apye, final String s) {
        apye.k(s);
    }
    
    public static void i(final apye apye, final long n) {
        apye.n(n);
    }
    
    public static void j(final apye apye, final String s) {
        apye.l(s);
    }
    
    private void k(final String k) {
        k.getClass();
        this.c |= 0x200;
        this.k = k;
    }
    
    private void l(final String f) {
        f.getClass();
        this.c |= 0x8;
        this.f = f;
    }
    
    private void m(final long i) {
        this.c |= 0x40;
        this.i = i;
    }
    
    private void n(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void o(final int g) {
        this.c |= 0x10;
        this.g = g;
    }
    
    private void p(final int h) {
        this.c |= 0x20;
        this.h = h;
    }
    
    private void q(final apyg apyg) {
        this.j = apyg.f;
        this.c |= 0x100;
    }
    
    private void r(final apyf apyf) {
        this.d = apyf.y;
        this.c |= 0x1;
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
                if ((b = apye.b) == null) {
                    synchronized (apye.class) {
                        if (apye.b == null) {
                            apye.b = (ahev)new ahcs((ahcz)apye.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apye.a;
            }
            case 4: {
                return new apyd();
            }
            case 3: {
                return new apye();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apye.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1002\u0006\b\u100c\b\t\u1008\t\n\u1004\u0005", new Object[] { "c", "d", apyf.a(), "e", "f", "g", "i", "j", apyg.a(), "k", "h" });
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
