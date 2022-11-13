import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcr extends ahbh implements ahcw
{
    public static final alcr a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alcr.class, (ahbh)(a = new alcr()));
    }
    
    private alcr() {
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
                if ((d = alcr.d) == null) {
                    synchronized (alcr.class) {
                        if (alcr.d == null) {
                            alcr.d = (ahdd)new ahba((ahbh)alcr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alcr.a;
            }
            case 4: {
                return new ahaz((ahbh)alcr.a);
            }
            case 3: {
                return new alcr();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcr.a, "\u0001\u0002\u0001\u0000\ue517\u1e94\ue5a3\u2883\u0002\u0000\u0000\u0001\ue517\u1e94\u143c\u0000\ue5a3\u2883\u103c\u0000", new Object[] { "c", "b", aphy.class, ajap.class });
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
