import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkz extends ahbh implements ahcw
{
    public static final ahkz a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkz.class, (ahbh)(a = new ahkz()));
    }
    
    private ahkz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahkz.c) == null) {
                    synchronized (ahkz.class) {
                        if (ahkz.c == null) {
                            ahkz.c = (ahdd)new ahba((ahbh)ahkz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahkz.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkz.a);
            }
            case 3: {
                return new ahkz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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
