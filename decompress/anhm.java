import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhm extends ahbh implements ahcw
{
    public static final anhm a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anhm.class, (ahbh)(a = new anhm()));
    }
    
    private anhm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anhm.c) == null) {
                    synchronized (anhm.class) {
                        if (anhm.c == null) {
                            anhm.c = (ahdd)new ahba((ahbh)anhm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anhm.a;
            }
            case 4: {
                return new ahaz((ahbh)anhm.a);
            }
            case 3: {
                return new anhm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhm.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100b\u0001", new Object[] { "d", "b" });
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
