import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkm extends ahbh implements ahcw
{
    public static final ahkm a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkm.class, (ahbh)(a = new ahkm()));
    }
    
    private ahkm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahkm.c) == null) {
                    synchronized (ahkm.class) {
                        if (ahkm.c == null) {
                            ahkm.c = (ahdd)new ahba((ahbh)ahkm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahkm.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkm.a);
            }
            case 3: {
                return new ahkm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
