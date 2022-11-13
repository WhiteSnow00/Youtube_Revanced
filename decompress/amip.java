import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amip extends ahbh implements ahcw
{
    public static final amip a;
    private static volatile ahdd d;
    public int b;
    public amio c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amip.class, (ahbh)(a = new amip()));
    }
    
    private amip() {
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
                if ((d = amip.d) == null) {
                    synchronized (amip.class) {
                        if (amip.d == null) {
                            amip.d = (ahdd)new ahba((ahbh)amip.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amip.a;
            }
            case 4: {
                return new ahaz((ahbh)amip.a);
            }
            case 3: {
                return new amip();
            }
            case 2: {
                return newMessageInfo((MessageLite)amip.a, "\u0001\u0001\u0000\u0001\uf237\u4161\uf237\u4161\u0001\u0000\u0000\u0001\uf237\u4161\u1409\u0000", new Object[] { "b", "c" });
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
