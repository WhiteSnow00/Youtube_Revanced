import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjw extends ahbh implements ahcw
{
    public static final amjw a;
    private static volatile ahdd d;
    public int b;
    public amju c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjw.class, (ahbh)(a = new amjw()));
    }
    
    private amjw() {
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
                if ((d = amjw.d) == null) {
                    synchronized (amjw.class) {
                        if (amjw.d == null) {
                            amjw.d = (ahdd)new ahba((ahbh)amjw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjw.a;
            }
            case 4: {
                return new ahaz((ahbh)amjw.a);
            }
            case 3: {
                return new amjw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjw.a, "\u0001\u0001\u0000\u0001\uf7b0\u43e2\uf7b0\u43e2\u0001\u0000\u0000\u0001\uf7b0\u43e2\u1409\u0000", new Object[] { "b", "c" });
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
