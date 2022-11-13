import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkr extends ahbh implements ahcw
{
    public static final amkr a;
    private static volatile ahdd b;
    private ahcr c;
    
    static {
        ahbh.registerDefaultInstance((Class)amkr.class, (ahbh)(a = new amkr()));
    }
    
    private amkr() {
        this.c = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amkr.b) == null) {
                    synchronized (amkr.class) {
                        if (amkr.b == null) {
                            amkr.b = (ahdd)new ahba((ahbh)amkr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkr.a;
            }
            case 4: {
                return new ahaz((ahbh)amkr.a);
            }
            case 3: {
                return new amkr();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkr.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", amkq.a });
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
