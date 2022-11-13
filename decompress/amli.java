import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amli extends ahbh implements ahcw
{
    public static final amli a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amli.class, (ahbh)(a = new amli()));
    }
    
    private amli() {
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
                if ((d = amli.d) == null) {
                    synchronized (amli.class) {
                        if (amli.d == null) {
                            amli.d = (ahdd)new ahba((ahbh)amli.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amli.a;
            }
            case 4: {
                return new ahaz((ahbh)amli.a);
            }
            case 3: {
                return new amli();
            }
            case 2: {
                return newMessageInfo((MessageLite)amli.a, "\u0001\u0007\u0001\u0000\ue592\u1be6\ue0c3\ud525\u0007\u0000\u0000\u0007\ue592\u1be6\u143c\u0000\ufc15\u1e98\u143c\u0000\ued6a\u25bb\u143c\u0000\ueb6b\u2cf9\u143c\u0000\uf492\u4933\u143c\u0000\ue05a\u4c64\u143c\u0000\ue0c3\ud525\u143c\u0000", new Object[] { "c", "b", amhi.class, aoad.class, aivd.class, ahyk.class, ajmo.class, aova.class, alnl.class });
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
