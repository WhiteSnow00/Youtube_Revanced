import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlb extends ahbh implements ahcw
{
    public static final ahlb a;
    private static volatile ahdd c;
    public float b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlb.class, (ahbh)(a = new ahlb()));
    }
    
    private ahlb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahlb.c) == null) {
                    synchronized (ahlb.class) {
                        if (ahlb.c == null) {
                            ahlb.c = (ahdd)new ahba((ahbh)ahlb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlb.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlb.a);
            }
            case 3: {
                return new ahlb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0000", new Object[] { "d", "b" });
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
