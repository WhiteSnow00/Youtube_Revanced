import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktq extends ahbh implements ahcw
{
    public static final aktq a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktq.class, (ahbh)(a = new aktq()));
    }
    
    private aktq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktq.d) == null) {
                    synchronized (aktq.class) {
                        if (aktq.d == null) {
                            aktq.d = (ahdd)new ahba((ahbh)aktq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktq.a;
            }
            case 4: {
                return new ahaz((ahbh)aktq.a);
            }
            case 3: {
                return new aktq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akwi.u });
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
