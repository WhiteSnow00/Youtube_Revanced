import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqu extends ahbh implements ahcw
{
    public static final agqu a;
    private static volatile ahdd c;
    public agrb b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqu.class, (ahbh)(a = new agqu()));
    }
    
    private agqu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agqu.c) == null) {
                    synchronized (agqu.class) {
                        if (agqu.c == null) {
                            agqu.c = (ahdd)new ahba((ahbh)agqu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqu.a;
            }
            case 4: {
                return new ahaz((ahbh)agqu.a);
            }
            case 3: {
                return new agqu();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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