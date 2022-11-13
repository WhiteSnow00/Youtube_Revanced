import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkg extends ahbh implements ahcw
{
    public static final amkg a;
    private static volatile ahdd c;
    public amkf b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkg.class, (ahbh)(a = new amkg()));
    }
    
    private amkg() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = amkg.c) == null) {
                    synchronized (amkg.class) {
                        if (amkg.c == null) {
                            amkg.c = (ahdd)new ahba((ahbh)amkg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amkg.a;
            }
            case 4: {
                return new ahaz((ahbh)amkg.a);
            }
            case 3: {
                return new amkg();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkg.a, "\u0001\u0001\u0000\u0001\uf7cc\u43ad\uf7cc\u43ad\u0001\u0000\u0000\u0001\uf7cc\u43ad\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
