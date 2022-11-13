import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcc extends ahbh implements ahcw
{
    public static final aqcc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcc.class, (ahbh)(a = new aqcc()));
    }
    
    private aqcc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqcc.b) == null) {
                    synchronized (aqcc.class) {
                        if (aqcc.b == null) {
                            aqcc.b = (ahdd)new ahba((ahbh)aqcc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcc.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcc.a);
            }
            case 3: {
                return new aqcc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcc.a, "\u0001\u0000", (Object[])null);
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
