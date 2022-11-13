import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amih extends ahbh implements ahcw
{
    public static final amih a;
    private static volatile ahdd d;
    public int b;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)amih.class, (ahbh)(a = new amih()));
    }
    
    private amih() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amih.d) == null) {
                    synchronized (amih.class) {
                        if (amih.d == null) {
                            amih.d = (ahdd)new ahba((ahbh)amih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amih.a;
            }
            case 4: {
                return new ahaz((ahbh)amih.a);
            }
            case 3: {
                return new amih();
            }
            case 2: {
                return newMessageInfo((MessageLite)amih.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "e", "b", anci.h, "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
