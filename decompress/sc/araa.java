import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araa extends ahbh implements ahcw
{
    private static final araa a;
    private static volatile ahdd b;
    private int c;
    private long d;
    private araz e;
    private long f;
    private arba g;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)araa.class, (ahbh)(a = new araa()));
    }
    
    private araa() {
    }
    
    public static aqzy b() {
        return (aqzy)araa.a.createBuilder();
    }
    
    static araa d() {
        return araa.a;
    }
    
    public static araa e() {
        return araa.a;
    }
    
    public static void f(final araa araa, final long n) {
        araa.k(n);
    }
    
    public static void g(final araa araa, final araz araz) {
        araa.m(araz);
    }
    
    public static void h(final araa araa, final long n) {
        araa.n(n);
    }
    
    public static void i(final araa araa, final arba arba) {
        araa.o(arba);
    }
    
    public static void j(final araa araa, final aqzz aqzz) {
        araa.l(aqzz);
    }
    
    private void k(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void l(final aqzz aqzz) {
        this.h = aqzz.d;
        this.c |= 0x10;
    }
    
    private void m(final araz e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void n(final long f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void o(final arba g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    public long a() {
        return this.f;
    }
    
    public aqzz c() {
        aqzz aqzz;
        if ((aqzz = aqzz.b(this.h)) == null) {
            aqzz = aqzz.a;
        }
        return aqzz;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = araa.b) == null) {
                    synchronized (araa.class) {
                        if (araa.b == null) {
                            araa.b = (ahdd)new ahba((ahbh)araa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return araa.a;
            }
            case 4: {
                return new aqzy();
            }
            case 3: {
                return new araa();
            }
            case 2: {
                return newMessageInfo((MessageLite)araa.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001\u0003\u1002\u0002\u0004\u1009\u0003\u0005\u100c\u0004", new Object[] { "c", "d", "e", "f", "g", "h", aqzz.a() });
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
