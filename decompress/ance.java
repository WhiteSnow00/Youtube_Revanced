import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ance extends ahbh implements ahcw
{
    public static final ance a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ance.class, (ahbh)(a = new ance()));
    }
    
    private ance() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ance.c) == null) {
                    synchronized (ance.class) {
                        if (ance.c == null) {
                            ance.c = (ahdd)new ahba((ahbh)ance.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ance.a;
            }
            case 4: {
                return new ahaz((ahbh)ance.a);
            }
            case 3: {
                return new ance();
            }
            case 2: {
                return newMessageInfo((MessageLite)ance.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
