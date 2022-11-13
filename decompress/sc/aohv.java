import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohv extends ahbh implements ahcw
{
    public static final aohv a;
    private static volatile ahdd c;
    public long b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aohv.class, (ahbh)(a = new aohv()));
    }
    
    private aohv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aohv.c) == null) {
                    synchronized (aohv.class) {
                        if (aohv.c == null) {
                            aohv.c = (ahdd)new ahba((ahbh)aohv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohv.a;
            }
            case 4: {
                return new ahaz((ahbh)aohv.a);
            }
            case 3: {
                return new aohv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
