import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anig extends ahbh implements ahcw
{
    public static final anig a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anig.class, (ahbh)(a = new anig()));
    }
    
    private anig() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anig.c) == null) {
                    synchronized (anig.class) {
                        if (anig.c == null) {
                            anig.c = (ahdd)new ahba((ahbh)anig.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anig.a;
            }
            case 4: {
                return new ahaz((ahbh)anig.a);
            }
            case 3: {
                return new anig();
            }
            case 2: {
                return newMessageInfo((MessageLite)anig.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1007\u0002", new Object[] { "d", "b" });
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
