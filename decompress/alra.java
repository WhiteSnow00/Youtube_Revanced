import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alra extends ahbh implements ahcw
{
    public static final alra a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alra.class, (ahbh)(a = new alra()));
    }
    
    private alra() {
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
                if ((d = alra.d) == null) {
                    synchronized (alra.class) {
                        if (alra.d == null) {
                            alra.d = (ahdd)new ahba((ahbh)alra.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alra.a;
            }
            case 4: {
                return new ahaz((ahbh)alra.a);
            }
            case 3: {
                return new alra();
            }
            case 2: {
                return newMessageInfo((MessageLite)alra.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\uff59\u3f35\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\uff59\u3f35\u143c\u0000", new Object[] { "c", "b", aicz.class, alqd.class });
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
