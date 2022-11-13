import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcb extends ahbh implements ahcw
{
    private static final ajcb a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private Object e;
    private ahab f;
    private String g;
    private String h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcb.class, (ahbh)(a = new ajcb()));
    }
    
    private ajcb() {
        this.d = 0;
        this.f = ahab.b;
        this.g = "";
        this.h = "";
    }
    
    public static ajca a() {
        return (ajca)ajcb.a.createBuilder();
    }
    
    static ajcb b() {
        return ajcb.a;
    }
    
    public static void c(final ajcb ajcb, final String s) {
        ajcb.i(s);
    }
    
    public static void d(final ajcb ajcb, final ajbz ajbz) {
        ajcb.l(ajbz);
    }
    
    public static void e(final ajcb ajcb, final int n) {
        ajcb.j(n);
    }
    
    public static void f(final ajcb ajcb, final ahab ahab) {
        ajcb.k(ahab);
    }
    
    public static void g(final ajcb ajcb, final String s) {
        ajcb.h(s);
    }
    
    private void h(final String g) {
        g.getClass();
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final String h) {
        h.getClass();
        this.c |= 0x10;
        this.h = h;
    }
    
    private void j(final int n) {
        this.d = 4;
        this.e = n;
    }
    
    private void k(final ahab f) {
        f.getClass();
        this.c |= 0x4;
        this.f = f;
    }
    
    private void l(final ajbz ajbz) {
        this.e = ajbz.n;
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajcb.b) == null) {
                    synchronized (ajcb.class) {
                        if (ajcb.b == null) {
                            ajcb.b = (ahdd)new ahba((ahbh)ajcb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcb.a;
            }
            case 4: {
                return new ajca();
            }
            case 3: {
                return new ajcb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcb.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u1008\u0003\u0003\u1008\u0004\u0004\u1037\u0000\u0005\u100a\u0002", new Object[] { "e", "d", "c", ajbz.a(), "g", "h", "f" });
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
