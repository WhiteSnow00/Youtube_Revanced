import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqex extends ahbh implements ahcw
{
    public static final aqex a;
    private static volatile ahdd d;
    public int b;
    public aqgv c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqex.class, (ahbh)(a = new aqex()));
    }
    
    private aqex() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqex.d) == null) {
                    synchronized (aqex.class) {
                        if (aqex.d == null) {
                            aqex.d = (ahdd)new ahba((ahbh)aqex.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqex.a;
            }
            case 4: {
                return new ahaz((ahbh)aqex.a);
            }
            case 3: {
                return new aqex();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqex.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
