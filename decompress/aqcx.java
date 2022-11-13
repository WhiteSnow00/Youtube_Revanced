import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcx extends ahbh implements ahcw
{
    public static final aqcx a;
    private static volatile ahdd d;
    public anwc b;
    public aneu c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcx.class, (ahbh)(a = new aqcx()));
    }
    
    private aqcx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqcx.d) == null) {
                    synchronized (aqcx.class) {
                        if (aqcx.d == null) {
                            aqcx.d = (ahdd)new ahba((ahbh)aqcx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcx.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcx.a);
            }
            case 3: {
                return new aqcx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
