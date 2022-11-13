import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrz extends ahbh implements ahcw
{
    public static final aqrz a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrz.class, (ahbh)(a = new aqrz()));
    }
    
    private aqrz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqrz.c) == null) {
                    synchronized (aqrz.class) {
                        if (aqrz.c == null) {
                            aqrz.c = (ahdd)new ahba((ahbh)aqrz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrz.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrz.a);
            }
            case 3: {
                return new aqrz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
