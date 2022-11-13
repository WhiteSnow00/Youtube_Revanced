import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwv extends ahbh implements ahcw
{
    private static final anwv a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private ajkk j;
    
    static {
        ahbh.registerDefaultInstance((Class)anwv.class, (ahbh)(a = new anwv()));
    }
    
    private anwv() {
        this.d = "";
    }
    
    public static anwu a() {
        return (anwu)anwv.a.createBuilder();
    }
    
    static anwv b() {
        return anwv.a;
    }
    
    public static void c(final anwv anwv, final String s) {
        anwv.k(s);
    }
    
    public static void d(final anwv anwv, final anws anws) {
        anwv.l(anws);
    }
    
    public static void e(final anwv anwv, final boolean b) {
        anwv.j(false);
    }
    
    public static void f(final anwv anwv, final ajkk ajkk) {
        anwv.m(ajkk);
    }
    
    public static void g(final anwv anwv, final int n) {
        anwv.n(n);
    }
    
    public static void h(final anwv anwv, final int n) {
        anwv.o(n);
    }
    
    public static void i(final anwv anwv, final anwt anwt) {
        anwv.p(anwt);
    }
    
    private void j(final boolean b) {
        this.c |= 0x40;
        this.i = false;
    }
    
    private void k(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void l(final anws anws) {
        this.h = anws.d;
        this.c |= 0x10;
    }
    
    private void m(final ajkk j) {
        j.getClass();
        this.j = j;
        this.c |= 0x100;
    }
    
    private void n(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void o(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void p(final anwt anwt) {
        this.g = anwt.d;
        this.c |= 0x8;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anwv.b) == null) {
                    synchronized (anwv.class) {
                        if (anwv.b == null) {
                            anwv.b = (ahdd)new ahba((ahbh)anwv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwv.a;
            }
            case 4: {
                return new anwu();
            }
            case 3: {
                return new anwv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwv.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0007\u1007\u0006\t\u1009\b", new Object[] { "c", "d", "e", "f", "g", anwt.a(), "h", anws.a(), "i", "j" });
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
