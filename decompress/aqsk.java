import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsk extends ahbh implements ahcw
{
    public static final aqsk a;
    private static volatile ahdd d;
    public int b;
    public aqrs c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsk.class, (ahbh)(a = new aqsk()));
    }
    
    private aqsk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqsk.d) == null) {
                    synchronized (aqsk.class) {
                        if (aqsk.d == null) {
                            aqsk.d = (ahdd)new ahba((ahbh)aqsk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsk.a);
            }
            case 3: {
                return new aqsk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
