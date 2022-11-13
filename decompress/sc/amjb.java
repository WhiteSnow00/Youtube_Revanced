import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjb extends ahbh implements ahcw
{
    public static final amjb a;
    private static volatile ahdd c;
    public amin b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjb.class, (ahbh)(a = new amjb()));
    }
    
    private amjb() {
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
                if ((c = amjb.c) == null) {
                    synchronized (amjb.class) {
                        if (amjb.c == null) {
                            amjb.c = (ahdd)new ahba((ahbh)amjb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjb.a;
            }
            case 4: {
                return new ahaz((ahbh)amjb.a);
            }
            case 3: {
                return new amjb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjb.a, "\u0001\u0001\u0000\u0001\ue309\u3ff2\ue309\u3ff2\u0001\u0000\u0000\u0001\ue309\u3ff2\u1409\u0000", new Object[] { "d", "b" });
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
