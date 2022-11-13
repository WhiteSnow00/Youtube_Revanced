import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuo extends ahbh implements ahcw
{
    public static final ajuo a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuo.class, (ahbh)(a = new ajuo()));
    }
    
    private ajuo() {
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
                if ((c = ajuo.c) == null) {
                    synchronized (ajuo.class) {
                        if (ajuo.c == null) {
                            ajuo.c = (ahdd)new ahba((ahbh)ajuo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajuo.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuo.a);
            }
            case 3: {
                return new ajuo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amud.q });
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
