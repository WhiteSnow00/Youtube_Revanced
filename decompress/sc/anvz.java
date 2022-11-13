import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvz extends ahbh implements ahcw
{
    public static final anvz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anvz.class, (ahbh)(a = new anvz()));
    }
    
    private anvz() {
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
                if ((d = anvz.d) == null) {
                    synchronized (anvz.class) {
                        if (anvz.d == null) {
                            anvz.d = (ahdd)new ahba((ahbh)anvz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anvz.a;
            }
            case 4: {
                return new ahaz((ahbh)anvz.a);
            }
            case 3: {
                return new anvz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvz.a, "\u0001\u0003\u0001\u0000\uf79d\u2b18\ue496\u3d35\u0003\u0000\u0000\u0003\uf79d\u2b18\u143c\u0000\uf03a\u2b94\u143c\u0000\ue496\u3d35\u143c\u0000", new Object[] { "c", "b", aodh.class, aias.class, amhp.class });
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
