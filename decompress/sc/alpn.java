import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpn extends ahbh implements ahcw
{
    public static final alpn a;
    private static volatile ahdd d;
    public int b;
    public ahan c;
    
    static {
        ahbh.registerDefaultInstance((Class)alpn.class, (ahbh)(a = new alpn()));
    }
    
    private alpn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alpn.d) == null) {
                    synchronized (alpn.class) {
                        if (alpn.d == null) {
                            alpn.d = (ahdd)new ahba((ahbh)alpn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpn.a;
            }
            case 4: {
                return new ahaz((ahbh)alpn.a);
            }
            case 3: {
                return new alpn();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpn.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0002", new Object[] { "b", "c" });
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
