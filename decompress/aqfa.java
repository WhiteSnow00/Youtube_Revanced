import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfa extends ahbh implements ahcw
{
    public static final aqfa a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfa.class, (ahbh)(a = new aqfa()));
    }
    
    private aqfa() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqfa.c) == null) {
                    synchronized (aqfa.class) {
                        if (aqfa.c == null) {
                            aqfa.c = (ahdd)new ahba((ahbh)aqfa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqfa.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfa.a);
            }
            case 3: {
                return new aqfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aqcl.k });
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
