import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjz extends ahbh implements ahcw
{
    public static final amjz a;
    private static volatile ahdd b;
    private int c;
    private amjy d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjz.class, (ahbh)(a = new amjz()));
    }
    
    private amjz() {
        this.e = 2;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = amjz.b) == null) {
                    synchronized (amjz.class) {
                        if (amjz.b == null) {
                            amjz.b = (ahdd)new ahba((ahbh)amjz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjz.a;
            }
            case 4: {
                return new ahaz((ahbh)amjz.a);
            }
            case 3: {
                return new amjz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
