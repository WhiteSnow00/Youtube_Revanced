import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdm extends ahbh implements ahcw
{
    public static final aqdm a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdm.class, (ahbh)(a = new aqdm()));
    }
    
    private aqdm() {
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
                if ((c = aqdm.c) == null) {
                    synchronized (aqdm.class) {
                        if (aqdm.c == null) {
                            aqdm.c = (ahdd)new ahba((ahbh)aqdm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqdm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdm.a);
            }
            case 3: {
                return new aqdm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdm.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
