import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anet extends ahbh implements ahcw
{
    public static final anet a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)anet.class, (ahbh)(a = new anet()));
    }
    
    private anet() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anet.d) == null) {
                    synchronized (anet.class) {
                        if (anet.d == null) {
                            anet.d = (ahdd)new ahba((ahbh)anet.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anet.a;
            }
            case 4: {
                return new ahaz((ahbh)anet.a);
            }
            case 3: {
                return new anet();
            }
            case 2: {
                return newMessageInfo((MessageLite)anet.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anes.a() });
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
