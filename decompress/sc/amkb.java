import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkb extends ahbh implements ahcw
{
    public static final amkb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkb.class, (ahbh)(a = new amkb()));
    }
    
    private amkb() {
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
                if ((d = amkb.d) == null) {
                    synchronized (amkb.class) {
                        if (amkb.d == null) {
                            amkb.d = (ahdd)new ahba((ahbh)amkb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkb.a;
            }
            case 4: {
                return new ahaz((ahbh)amkb.a);
            }
            case 3: {
                return new amkb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkb.a, "\u0001\u0002\u0001\u0000\uf66d\u43e2\uf2ce\u4414\u0002\u0000\u0000\u0001\uf66d\u43e2\u143c\u0000\uf2ce\u4414\u103c\u0000", new Object[] { "c", "b", amjx.class, aplz.class });
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
