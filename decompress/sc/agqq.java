import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqq extends ahbh implements ahcw
{
    public static final agqq a;
    private static volatile ahdd d;
    public int b;
    public agqp c;
    
    static {
        ahbh.registerDefaultInstance((Class)agqq.class, (ahbh)(a = new agqq()));
    }
    
    private agqq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agqq.d) == null) {
                    synchronized (agqq.class) {
                        if (agqq.d == null) {
                            agqq.d = (ahdd)new ahba((ahbh)agqq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqq.a;
            }
            case 4: {
                return new ahaz((ahbh)agqq.a);
            }
            case 3: {
                return new agqq();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
