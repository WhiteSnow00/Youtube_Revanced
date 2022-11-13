import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alno extends ahbh implements ahcw
{
    private static final alno a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)alno.class, (ahbh)(a = new alno()));
    }
    
    private alno() {
    }
    
    public static alnn a() {
        return (alnn)alno.a.createBuilder();
    }
    
    static alno b() {
        return alno.a;
    }
    
    public static void c(final alno alno, final alnp alnp) {
        alno.f(alnp);
    }
    
    public static void d(final alno alno, final int n) {
        alno.e(n);
    }
    
    private void e(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final alnp alnp) {
        this.d = alnp.j;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alno.b) == null) {
                    synchronized (alno.class) {
                        if (alno.b == null) {
                            alno.b = (ahdd)new ahba((ahbh)alno.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alno.a;
            }
            case 4: {
                return new alnn();
            }
            case 3: {
                return new alno();
            }
            case 2: {
                return newMessageInfo((MessageLite)alno.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "c", "d", alnp.a(), "e" });
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
