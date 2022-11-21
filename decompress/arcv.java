import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcv extends ahcz implements aheo
{
    private static final arcv a;
    private static volatile ahev b;
    private int c;
    private long d;
    private ardu e;
    private long f;
    private ardv g;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(arcv.class, a = new arcv());
    }
    
    private arcv() {
    }
    
    public static arct b() {
        return (arct)arcv.a.createBuilder();
    }
    
    static arcv d() {
        return arcv.a;
    }
    
    public static arcv e() {
        return arcv.a;
    }
    
    public static void f(final arcv arcv, final long n) {
        arcv.k(n);
    }
    
    public static void g(final arcv arcv, final ardu ardu) {
        arcv.m(ardu);
    }
    
    public static void h(final arcv arcv, final long n) {
        arcv.n(n);
    }
    
    public static void i(final arcv arcv, final ardv ardv) {
        arcv.o(ardv);
    }
    
    public static void j(final arcv arcv, final arcu arcu) {
        arcv.l(arcu);
    }
    
    private void k(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void l(final arcu arcu) {
        this.h = arcu.d;
        this.c |= 0x10;
    }
    
    private void m(final ardu e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void n(final long f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void o(final ardv g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    public long a() {
        return this.f;
    }
    
    public arcu c() {
        arcu arcu;
        if ((arcu = arcu.b(this.h)) == null) {
            arcu = arcu.a;
        }
        return arcu;
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
                if ((b = arcv.b) == null) {
                    synchronized (arcv.class) {
                        if (arcv.b == null) {
                            arcv.b = (ahev)new ahcs((ahcz)arcv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcv.a;
            }
            case 4: {
                return new arct();
            }
            case 3: {
                return new arcv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcv.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001\u0003\u1002\u0002\u0004\u1009\u0003\u0005\u100c\u0004", new Object[] { "c", "d", "e", "f", "g", "h", arcu.a() });
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
