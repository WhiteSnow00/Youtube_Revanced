import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqde extends ahbh implements ahcw
{
    public static final aqde a;
    private static volatile ahdd d;
    public int b;
    public ahdy c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqde.class, (ahbh)(a = new aqde()));
    }
    
    private aqde() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqde.d) == null) {
                    synchronized (aqde.class) {
                        if (aqde.d == null) {
                            aqde.d = (ahdd)new ahba((ahbh)aqde.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqde.a;
            }
            case 4: {
                return new ahaz((ahbh)aqde.a);
            }
            case 3: {
                return new aqde();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqde.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
