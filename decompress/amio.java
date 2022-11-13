import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amio extends ahbh implements ahcw
{
    public static final amio a;
    private static volatile ahdd f;
    public amik b;
    public amil c;
    public amik d;
    public amil e;
    private int g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amio.class, (ahbh)(a = new amio()));
    }
    
    private amio() {
        this.h = 2;
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
                final ahdd f;
                if ((f = amio.f) == null) {
                    synchronized (amio.class) {
                        if (amio.f == null) {
                            amio.f = (ahdd)new ahba((ahbh)amio.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amio.a;
            }
            case 4: {
                return new ahaz((ahbh)amio.a);
            }
            case 3: {
                return new amio();
            }
            case 2: {
                return newMessageInfo((MessageLite)amio.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
