import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrv extends ahbh implements ahcw
{
    public static final aqrv a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrv.class, (ahbh)(a = new aqrv()));
    }
    
    private aqrv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqrv.d) == null) {
                    synchronized (aqrv.class) {
                        if (aqrv.d == null) {
                            aqrv.d = (ahdd)new ahba((ahbh)aqrv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqrv.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrv.a);
            }
            case 3: {
                return new aqrv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
