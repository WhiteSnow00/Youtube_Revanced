import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiz extends ahbh implements ahcw
{
    public static final amiz a;
    private static volatile ahdd d;
    public int b;
    public amjj c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amiz.class, (ahbh)(a = new amiz()));
    }
    
    private amiz() {
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
                if ((d = amiz.d) == null) {
                    synchronized (amiz.class) {
                        if (amiz.d == null) {
                            amiz.d = (ahdd)new ahba((ahbh)amiz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amiz.a;
            }
            case 4: {
                return new ahaz((ahbh)amiz.a);
            }
            case 3: {
                return new amiz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiz.a, "\u0001\u0001\u0000\u0001\uf574\u3c15\uf574\u3c15\u0001\u0000\u0000\u0001\uf574\u3c15\u1409\u0000", new Object[] { "b", "c" });
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
