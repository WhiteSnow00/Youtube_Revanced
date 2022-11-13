import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcd extends ahbh implements ahcw
{
    public static final aqcd a;
    private static volatile ahdd d;
    public int b;
    public aqce c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcd.class, (ahbh)(a = new aqcd()));
    }
    
    private aqcd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqcd.d) == null) {
                    synchronized (aqcd.class) {
                        if (aqcd.d == null) {
                            aqcd.d = (ahdd)new ahba((ahbh)aqcd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcd.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcd.a);
            }
            case 3: {
                return new aqcd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
