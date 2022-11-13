import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqll extends ahbh implements ahcw
{
    public static final aqll a;
    private static volatile ahdd g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqll.class, (ahbh)(a = new aqll()));
    }
    
    private aqll() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqll.g) == null) {
                    synchronized (aqll.class) {
                        if (aqll.g == null) {
                            aqll.g = (ahdd)new ahba((ahbh)aqll.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqll.a;
            }
            case 4: {
                return new ahaz((ahbh)aqll.a);
            }
            case 3: {
                return new aqll();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqll.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
