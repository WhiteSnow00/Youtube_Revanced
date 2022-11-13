import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arak extends ahbh implements ahcw
{
    private static final arak a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private ahft e;
    private int f;
    private boolean g;
    
    static {
        ahbh.registerDefaultInstance((Class)arak.class, (ahbh)(a = new arak()));
    }
    
    private arak() {
    }
    
    public static araj a() {
        return (araj)arak.a.createBuilder();
    }
    
    static arak b() {
        return arak.a;
    }
    
    public static void c(final arak arak, final aral aral) {
        arak.j(aral);
    }
    
    public static void d(final arak arak, final boolean b) {
        arak.h(b);
    }
    
    public static void e(final arak arak, final int n) {
        arak.g(n);
    }
    
    public static void f(final arak arak, final ahft ahft) {
        arak.i(ahft);
    }
    
    private void g(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void h(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final ahft e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final aral aral) {
        this.f = aral.f;
        this.c |= 0x4;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = arak.b) == null) {
                    synchronized (arak.class) {
                        if (arak.b == null) {
                            arak.b = (ahdd)new ahba((ahbh)arak.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arak.a;
            }
            case 4: {
                return new araj();
            }
            case 3: {
                return new arak();
            }
            case 2: {
                return newMessageInfo((MessageLite)arak.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", aral.a(), "g" });
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
