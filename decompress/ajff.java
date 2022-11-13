import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajff extends ahbh implements ahcw
{
    public static final ajff a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajff.class, (ahbh)(a = new ajff()));
    }
    
    private ajff() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajff.c) == null) {
                    synchronized (ajff.class) {
                        if (ajff.c == null) {
                            ajff.c = (ahdd)new ahba((ahbh)ajff.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajff.a;
            }
            case 4: {
                return new ahaz((ahbh)ajff.a);
            }
            case 3: {
                return new ajff();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajff.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
