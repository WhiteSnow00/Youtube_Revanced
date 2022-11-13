import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohf extends ahbh implements ahcw
{
    public static final aohf a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aohf.class, (ahbh)(a = new aohf()));
    }
    
    private aohf() {
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
                if ((c = aohf.c) == null) {
                    synchronized (aohf.class) {
                        if (aohf.c == null) {
                            aohf.c = (ahdd)new ahba((ahbh)aohf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohf.a;
            }
            case 4: {
                return new ahaz((ahbh)aohf.a);
            }
            case 3: {
                return new aohf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
