import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqx extends ahbh implements ahcw
{
    public static final alqx a;
    private static volatile ahdd h;
    public int b;
    public long c;
    public long d;
    public long e;
    public alqw f;
    public ajut g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alqx.class, (ahbh)(a = new alqx()));
    }
    
    private alqx() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = alqx.h) == null) {
                    synchronized (alqx.class) {
                        if (alqx.h == null) {
                            alqx.h = (ahdd)new ahba((ahbh)alqx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqx.a;
            }
            case 4: {
                return new ahaz((ahbh)alqx.a);
            }
            case 3: {
                return new alqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqx.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u1002\u0000\u0002\u1002\u0001\u0005\u1409\u0005\u0006\u1002\u0004\u0007\u1409\u0006", new Object[] { "b", "c", "d", "f", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
