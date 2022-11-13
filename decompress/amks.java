import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amks extends ahbh implements ahcw
{
    public static final amks a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)amks.class, (ahbh)(a = new amks()));
    }
    
    private amks() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = amks.c) == null) {
                    synchronized (amks.class) {
                        if (amks.c == null) {
                            amks.c = (ahdd)new ahba((ahbh)amks.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amks.a;
            }
            case 4: {
                return new ahaz((ahbh)amks.a);
            }
            case 3: {
                return new amks();
            }
            case 2: {
                return newMessageInfo((MessageLite)amks.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ameu.u });
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
