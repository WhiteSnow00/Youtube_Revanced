import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdk extends ahbh implements ahcw
{
    public static final aqdk a;
    private static volatile ahdd d;
    public int b;
    public ahdy c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdk.class, (ahbh)(a = new aqdk()));
    }
    
    private aqdk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqdk.d) == null) {
                    synchronized (aqdk.class) {
                        if (aqdk.d == null) {
                            aqdk.d = (ahdd)new ahba((ahbh)aqdk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqdk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdk.a);
            }
            case 3: {
                return new aqdk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
