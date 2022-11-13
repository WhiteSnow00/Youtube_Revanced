import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfq extends ahbh implements ahcw
{
    public static final aqfq a;
    private static volatile ahdd d;
    public int b;
    public float c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfq.class, (ahbh)(a = new aqfq()));
    }
    
    private aqfq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqfq.d) == null) {
                    synchronized (aqfq.class) {
                        if (aqfq.d == null) {
                            aqfq.d = (ahdd)new ahba((ahbh)aqfq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfq.a);
            }
            case 3: {
                return new aqfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
