import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arai extends ahbh implements ahcw
{
    public static final arai a;
    private static volatile ahdd d;
    public int b;
    public aqxx c;
    
    static {
        ahbh.registerDefaultInstance((Class)arai.class, (ahbh)(a = new arai()));
    }
    
    private arai() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = arai.d) == null) {
                    synchronized (arai.class) {
                        if (arai.d == null) {
                            arai.d = (ahdd)new ahba((ahbh)arai.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arai.a;
            }
            case 4: {
                return new ahaz((ahbh)arai.a);
            }
            case 3: {
                return new arai();
            }
            case 2: {
                return newMessageInfo((MessageLite)arai.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
