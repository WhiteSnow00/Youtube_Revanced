import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprc extends ahbh implements ahcw
{
    public static final aprc a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aprc.class, (ahbh)(a = new aprc()));
    }
    
    private aprc() {
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
                if ((d = aprc.d) == null) {
                    synchronized (aprc.class) {
                        if (aprc.d == null) {
                            aprc.d = (ahdd)new ahba((ahbh)aprc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprc.a;
            }
            case 4: {
                return new ahaz((ahbh)aprc.a);
            }
            case 3: {
                return new aprc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprc.a, "\u0001\u0003\u0001\u0000\uf03a\u2b94\ue496\u3d35\u0003\u0000\u0000\u0003\uf03a\u2b94\u143c\u0000\ufb65\u31c3\u143c\u0000\ue496\u3d35\u143c\u0000", new Object[] { "c", "b", aias.class, aiaq.class, amhp.class });
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
