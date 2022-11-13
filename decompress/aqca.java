import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqca extends ahbh implements ahcw
{
    private static final aqca a;
    private static volatile ahdd b;
    private int c;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqca.class, (ahbh)(a = new aqca()));
    }
    
    private aqca() {
    }
    
    public static aqbz a() {
        return (aqbz)aqca.a.createBuilder();
    }
    
    static aqca b() {
        return aqca.a;
    }
    
    public static void c(final aqca aqca, final apta apta) {
        aqca.d(apta);
    }
    
    private void d(final apta apta) {
        this.d = apta.k;
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
                if ((b = aqca.b) == null) {
                    synchronized (aqca.class) {
                        if (aqca.b == null) {
                            aqca.b = (ahdd)new ahba((ahbh)aqca.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqca.a;
            }
            case 4: {
                return new aqbz();
            }
            case 3: {
                return new aqca();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqca.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apta.a() });
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
