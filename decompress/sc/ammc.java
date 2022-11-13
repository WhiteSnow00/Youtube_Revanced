import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammc extends ahbh implements ahcw
{
    public static final ammc a;
    private static volatile ahdd b;
    private int c;
    private amma d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ammc.class, (ahbh)(a = new ammc()));
    }
    
    private ammc() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = ammc.b) == null) {
                    synchronized (ammc.class) {
                        if (ammc.b == null) {
                            ammc.b = (ahdd)new ahba((ahbh)ammc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ammc.a;
            }
            case 4: {
                return new ahaz((ahbh)ammc.a);
            }
            case 3: {
                return new ammc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ammc.a, "\u0001\u0001\u0000\u0001\uf898\u255b\uf898\u255b\u0001\u0000\u0000\u0001\uf898\u255b\u1409\u0000", new Object[] { "c", "d" });
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
