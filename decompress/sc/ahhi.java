import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhi extends ahbh implements ahcw
{
    public static final ahhi a;
    private static volatile ahdd d;
    public int b;
    public ahhh c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhi.class, (ahbh)(a = new ahhi()));
    }
    
    private ahhi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahhi.d) == null) {
                    synchronized (ahhi.class) {
                        if (ahhi.d == null) {
                            ahhi.d = (ahdd)new ahba((ahbh)ahhi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhi.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhi.a);
            }
            case 3: {
                return new ahhi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
