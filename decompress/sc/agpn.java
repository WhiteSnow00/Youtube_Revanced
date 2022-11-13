import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpn extends ahbh implements ahcw
{
    public static final agpn a;
    private static volatile ahdd c;
    public String b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpn.class, (ahbh)(a = new agpn()));
    }
    
    private agpn() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agpn.c) == null) {
                    synchronized (agpn.class) {
                        if (agpn.c == null) {
                            agpn.c = (ahdd)new ahba((ahbh)agpn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpn.a;
            }
            case 4: {
                return new ahaz((ahbh)agpn.a);
            }
            case 3: {
                return new agpn();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpn.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
