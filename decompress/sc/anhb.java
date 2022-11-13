import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhb extends ahbh implements ahcw
{
    public static final anhb a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anhb.class, (ahbh)(a = new anhb()));
    }
    
    private anhb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anhb.c) == null) {
                    synchronized (anhb.class) {
                        if (anhb.c == null) {
                            anhb.c = (ahdd)new ahba((ahbh)anhb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anhb.a;
            }
            case 4: {
                return new ahaz((ahbh)anhb.a);
            }
            case 3: {
                return new anhb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
