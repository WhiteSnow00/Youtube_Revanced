import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcj extends ahbh implements ahcw
{
    public static final aqcj a;
    private static volatile ahdd c;
    public long b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcj.class, (ahbh)(a = new aqcj()));
    }
    
    private aqcj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqcj.c) == null) {
                    synchronized (aqcj.class) {
                        if (aqcj.c == null) {
                            aqcj.c = (ahdd)new ahba((ahbh)aqcj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcj.a);
            }
            case 3: {
                return new aqcj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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