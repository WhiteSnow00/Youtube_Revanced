import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcq extends ahbh implements ahcw
{
    public static final aqcq a;
    private static volatile ahdd c;
    public long b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcq.class, (ahbh)(a = new aqcq()));
    }
    
    private aqcq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqcq.c) == null) {
                    synchronized (aqcq.class) {
                        if (aqcq.c == null) {
                            aqcq.c = (ahdd)new ahba((ahbh)aqcq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcq.a);
            }
            case 3: {
                return new aqcq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
