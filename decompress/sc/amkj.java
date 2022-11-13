import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkj extends ahbh implements ahcw
{
    public static final amkj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkj.class, (ahbh)(a = new amkj()));
    }
    
    private amkj() {
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
                if ((d = amkj.d) == null) {
                    synchronized (amkj.class) {
                        if (amkj.d == null) {
                            amkj.d = (ahdd)new ahba((ahbh)amkj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkj.a;
            }
            case 4: {
                return new ahaz((ahbh)amkj.a);
            }
            case 3: {
                return new amkj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkj.a, "\u0001\u0005\u0001\u0000\ueb11\u1f11\ufc56\uab1f\u0005\u0000\u0000\u0004\ueb11\u1f11\u143c\u0000\ufd0c\u399c\u143c\u0000\uebde\u9991\u143c\u0000\ue123\u9dbf\u103c\u0000\ufc56\uab1f\u143c\u0000", new Object[] { "c", "b", aicz.class, amlp.class, aovj.class, aovk.class, akdc.class });
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
