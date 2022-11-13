import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjx extends ahbh implements ahcw
{
    public static final amjx a;
    private static volatile ahdd d;
    public ahbx b;
    public int c;
    private int e;
    private ajut f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)amjx.class, (ahbh)(a = new amjx()));
    }
    
    private amjx() {
        this.g = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amjx.d) == null) {
                    synchronized (amjx.class) {
                        if (amjx.d == null) {
                            amjx.d = (ahdd)new ahba((ahbh)amjx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjx.a;
            }
            case 4: {
                return new ahaz((ahbh)amjx.a);
            }
            case 3: {
                return new amjx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", amjw.class, "f", "c", ameu.r });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
