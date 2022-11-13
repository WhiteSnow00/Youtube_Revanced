import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpr extends ahbh implements ahcw
{
    public static final agpr a;
    private static volatile ahdd c;
    public agpt b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpr.class, (ahbh)(a = new agpr()));
    }
    
    private agpr() {
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agpr.c) == null) {
                    synchronized (agpr.class) {
                        if (agpr.c == null) {
                            agpr.c = (ahdd)new ahba((ahbh)agpr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpr.a;
            }
            case 4: {
                return new ahaz((ahbh)agpr.a);
            }
            case 3: {
                return new agpr();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpr.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
