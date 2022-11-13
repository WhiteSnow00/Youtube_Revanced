import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpx extends ahbh implements ahcw
{
    public static final afpx a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)afpx.class, (ahbh)(a = new afpx()));
    }
    
    private afpx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = afpx.d) == null) {
                    synchronized (afpx.class) {
                        if (afpx.d == null) {
                            afpx.d = (ahdd)new ahba((ahbh)afpx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afpx.a;
            }
            case 4: {
                return new ahaz((ahbh)afpx.a);
            }
            case 3: {
                return new afpx();
            }
            case 2: {
                return newMessageInfo((MessageLite)afpx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
