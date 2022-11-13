import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkn extends ahbh implements ahcw
{
    public static final amkn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)amkn.class, (ahbh)(a = new amkn()));
    }
    
    private amkn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amkn.b) == null) {
                    synchronized (amkn.class) {
                        if (amkn.b == null) {
                            amkn.b = (ahdd)new ahba((ahbh)amkn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkn.a;
            }
            case 4: {
                return new ahaz((ahbh)amkn.a);
            }
            case 3: {
                return new amkn();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkn.a, "\u0001\u0000", (Object[])null);
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
