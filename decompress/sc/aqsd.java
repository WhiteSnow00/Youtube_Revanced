import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsd extends ahbh implements ahcw
{
    public static final aqsd a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsd.class, (ahbh)(a = new aqsd()));
    }
    
    private aqsd() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqsd.d) == null) {
                    synchronized (aqsd.class) {
                        if (aqsd.d == null) {
                            aqsd.d = (ahdd)new ahba((ahbh)aqsd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsd.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsd.a);
            }
            case 3: {
                return new aqsd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
