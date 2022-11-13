import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdi extends ahbh implements ahcw
{
    public static final aqdi a;
    private static volatile ahdd d;
    public int b;
    public amfw c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdi.class, (ahbh)(a = new aqdi()));
    }
    
    private aqdi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqdi.d) == null) {
                    synchronized (aqdi.class) {
                        if (aqdi.d == null) {
                            aqdi.d = (ahdd)new ahba((ahbh)aqdi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqdi.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdi.a);
            }
            case 3: {
                return new aqdi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0001", new Object[] { "b", "c" });
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
