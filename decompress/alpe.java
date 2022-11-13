import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpe extends ahbh implements ahcw
{
    public static final alpe a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpe.class, (ahbh)(a = new alpe()));
    }
    
    private alpe() {
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
                if ((d = alpe.d) == null) {
                    synchronized (alpe.class) {
                        if (alpe.d == null) {
                            alpe.d = (ahdd)new ahba((ahbh)alpe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpe.a;
            }
            case 4: {
                return new ahaz((ahbh)alpe.a);
            }
            case 3: {
                return new alpe();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpe.a, "\u0001\u0001\u0001\u0000\ufd38\u37ee\ufd38\u37ee\u0001\u0000\u0000\u0001\ufd38\u37ee\u143c\u0000", new Object[] { "c", "b", alqo.class });
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
