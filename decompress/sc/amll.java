import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amll extends ahbh implements ahcw
{
    public static final amll a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amll.class, (ahbh)(a = new amll()));
    }
    
    private amll() {
        this.b = 0;
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
                final ahdd d;
                if ((d = amll.d) == null) {
                    synchronized (amll.class) {
                        if (amll.d == null) {
                            amll.d = (ahdd)new ahba((ahbh)amll.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amll.a;
            }
            case 4: {
                return new ahaz((ahbh)amll.a);
            }
            case 3: {
                return new amll();
            }
            case 2: {
                return newMessageInfo((MessageLite)amll.a, "\u0001\u0001\u0001\u0000\uf171\u3996\uf171\u3996\u0001\u0000\u0000\u0001\uf171\u3996\u143c\u0000", new Object[] { "c", "b", amlh.class });
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
