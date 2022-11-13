import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amja extends ahbh implements ahcw
{
    public static final amja a;
    private static volatile ahdd g;
    public int b;
    public anuv c;
    public ajut d;
    public ahbx e;
    public int f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amja.class, (ahbh)(a = new amja()));
    }
    
    private amja() {
        this.h = 2;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = amja.g) == null) {
                    synchronized (amja.class) {
                        if (amja.g == null) {
                            amja.g = (ahdd)new ahba((ahbh)amja.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amja.a;
            }
            case 4: {
                return new ahaz((ahbh)amja.a);
            }
            case 3: {
                return new amja();
            }
            case 2: {
                return newMessageInfo((MessageLite)amja.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002", new Object[] { "b", "c", "d", "e", anuv.class, "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
