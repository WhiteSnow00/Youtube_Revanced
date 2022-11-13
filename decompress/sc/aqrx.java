import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrx extends ahbh implements ahcw
{
    public static final aqrx a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public long d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrx.class, (ahbh)(a = new aqrx()));
    }
    
    private aqrx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrx.f) == null) {
                    synchronized (aqrx.class) {
                        if (aqrx.f == null) {
                            aqrx.f = (ahdd)new ahba((ahbh)aqrx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrx.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrx.a);
            }
            case 3: {
                return new aqrx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrx.a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
