import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alco extends ahbh implements ahcw
{
    public static final alco a;
    private static volatile ahdd d;
    public akli b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alco.class, (ahbh)(a = new alco()));
    }
    
    private alco() {
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
                if ((d = alco.d) == null) {
                    synchronized (alco.class) {
                        if (alco.d == null) {
                            alco.d = (ahdd)new ahba((ahbh)alco.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alco.a;
            }
            case 4: {
                return new ahaz((ahbh)alco.a);
            }
            case 3: {
                return new alco();
            }
            case 2: {
                return newMessageInfo((MessageLite)alco.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", "c", akwi.p });
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
