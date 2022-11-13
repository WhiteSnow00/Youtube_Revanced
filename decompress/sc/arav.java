import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arav extends ahbh implements ahcw
{
    public static final arav a;
    private static volatile ahdd c;
    public ahcr b;
    
    static {
        ahbh.registerDefaultInstance((Class)arav.class, (ahbh)(a = new arav()));
    }
    
    private arav() {
        this.b = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = arav.c) == null) {
                    synchronized (arav.class) {
                        if (arav.c == null) {
                            arav.c = (ahdd)new ahba((ahbh)arav.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return arav.a;
            }
            case 4: {
                return new ahaz((ahbh)arav.a);
            }
            case 3: {
                return new arav();
            }
            case 2: {
                return newMessageInfo((MessageLite)arav.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", arau.a });
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
