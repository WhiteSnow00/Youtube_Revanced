import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajco extends ahbh implements ahcw
{
    public static final ajco a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajco.class, (ahbh)(a = new ajco()));
    }
    
    private ajco() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajco.c) == null) {
                    synchronized (ajco.class) {
                        if (ajco.c == null) {
                            ajco.c = (ahdd)new ahba((ahbh)ajco.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajco.a;
            }
            case 4: {
                return new ahaz((ahbh)ajco.a);
            }
            case 3: {
                return new ajco();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajco.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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