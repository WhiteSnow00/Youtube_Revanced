import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anap extends ahbh implements ahcw
{
    public static final anap a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anap.class, (ahbh)(a = new anap()));
    }
    
    private anap() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anap.c) == null) {
                    synchronized (anap.class) {
                        if (anap.c == null) {
                            anap.c = (ahdd)new ahba((ahbh)anap.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anap.a;
            }
            case 4: {
                return new ahaz((ahbh)anap.a);
            }
            case 3: {
                return new anap();
            }
            case 2: {
                return newMessageInfo((MessageLite)anap.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amvu.p });
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
