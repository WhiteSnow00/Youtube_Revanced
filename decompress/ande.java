import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ande extends ahbh implements ahcw
{
    private static final ande a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private andc e;
    private int f;
    private String g;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)ande.class, (ahbh)(a = new ande()));
    }
    
    private ande() {
        this.g = "";
    }
    
    public static andd a() {
        return (andd)ande.a.createBuilder();
    }
    
    static ande b() {
        return ande.a;
    }
    
    public static void c(final ande ande, final andi andi) {
        ande.k(andi);
    }
    
    public static void d(final ande ande, final andh andh) {
        ande.j(andh);
    }
    
    public static void e(final ande ande, final andc andc) {
        ande.l(andc);
    }
    
    public static void f(final ande ande, final ajdz ajdz) {
        ande.i(ajdz);
    }
    
    public static void g(final ande ande, final String s) {
        ande.h(s);
    }
    
    private void h(final String g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final ajdz ajdz) {
        this.f = ajdz.B;
        this.c |= 0x4;
    }
    
    private void j(final andh andh) {
        this.h = andh.p;
        this.c |= 0x10;
    }
    
    private void k(final andi andi) {
        this.d = andi.f;
        this.c |= 0x1;
    }
    
    private void l(final andc e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ande.b) == null) {
                    synchronized (ande.class) {
                        if (ande.b == null) {
                            ande.b = (ahdd)new ahba((ahbh)ande.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ande.a;
            }
            case 4: {
                return new andd();
            }
            case 3: {
                return new ande();
            }
            case 2: {
                return newMessageInfo((MessageLite)ande.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u100c\u0004", new Object[] { "c", "d", andi.a(), "e", "f", ajdz.a(), "g", "h", andh.a() });
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
