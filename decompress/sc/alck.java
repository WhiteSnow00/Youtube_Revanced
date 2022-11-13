import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alck extends ahbh implements ahcw
{
    public static final alck a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alck.class, (ahbh)(a = new alck()));
    }
    
    private alck() {
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
                if ((d = alck.d) == null) {
                    synchronized (alck.class) {
                        if (alck.d == null) {
                            alck.d = (ahdd)new ahba((ahbh)alck.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alck.a;
            }
            case 4: {
                return new ahaz((ahbh)alck.a);
            }
            case 3: {
                return new alck();
            }
            case 2: {
                return newMessageInfo((MessageLite)alck.a, "\u0001\u0001\u0001\u0000\ue517\u1e94\ue517\u1e94\u0001\u0000\u0000\u0001\ue517\u1e94\u143c\u0000", new Object[] { "c", "b", aphy.class });
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
