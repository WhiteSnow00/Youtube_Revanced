import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqph extends ahcz implements aheo
{
    private static final aqph a;
    private static volatile ahev b;
    private int c;
    private int d;
    private Object e;
    private ahfq f;
    private String g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aqph.class, a = new aqph());
    }
    
    private aqph() {
        this.d = 0;
        this.h = 2;
        this.g = "";
    }
    
    public static aqpg a() {
        return (aqpg)aqph.a.createBuilder();
    }
    
    static aqph b() {
        return aqph.a;
    }
    
    public static void c(final aqph aqph, final ahfq ahfq) {
        aqph.p(ahfq);
    }
    
    public static void d(final aqph aqph, final aqpf aqpf) {
        aqph.o(aqpf);
    }
    
    public static void e(final aqph aqph, final aqpd aqpd) {
        aqph.n(aqpd);
    }
    
    public static void f(final aqph aqph, final aqov aqov) {
        aqph.k(aqov);
    }
    
    public static void g(final aqph aqph, final aqot aqot) {
        aqph.j(aqot);
    }
    
    public static void h(final aqph aqph, final aqpb aqpb) {
        aqph.m(aqpb);
    }
    
    public static void i(final aqph aqph, final aqox aqox) {
        aqph.l(aqox);
    }
    
    private void j(final aqot e) {
        e.getClass();
        this.e = e;
        this.d = 5;
    }
    
    private void k(final aqov e) {
        e.getClass();
        this.e = e;
        this.d = 4;
    }
    
    private void l(final aqox e) {
        e.getClass();
        this.e = e;
        this.d = 9;
    }
    
    private void m(final aqpb e) {
        e.getClass();
        this.e = e;
        this.d = 8;
    }
    
    private void n(final aqpd e) {
        e.getClass();
        this.e = e;
        this.d = 3;
    }
    
    private void o(final aqpf e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void p(final ahfq f) {
        f.getClass();
        this.f = f;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqph.b) == null) {
                    synchronized (aqph.class) {
                        if (aqph.b == null) {
                            aqph.b = (ahev)new ahcs((ahcz)aqph.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqph.a;
            }
            case 4: {
                return new aqpg();
            }
            case 3: {
                return new aqph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqph.a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u103c\u0000\u0003\u143c\u0000\u0004\u143c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "e", "d", "c", "f", aqpf.class, aqpd.class, aqov.class, aqot.class, aqoz.class, aqpb.class, aqox.class });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
