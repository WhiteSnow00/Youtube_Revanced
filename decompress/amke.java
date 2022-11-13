import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amke extends ahbh implements ahcw
{
    public static final amke a;
    private static volatile ahdd d;
    public int b;
    public amkd c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amke.class, (ahbh)(a = new amke()));
    }
    
    private amke() {
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
                if ((d = amke.d) == null) {
                    synchronized (amke.class) {
                        if (amke.d == null) {
                            amke.d = (ahdd)new ahba((ahbh)amke.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amke.a;
            }
            case 4: {
                return new ahaz((ahbh)amke.a);
            }
            case 3: {
                return new amke();
            }
            case 2: {
                return newMessageInfo((MessageLite)amke.a, "\u0001\u0001\u0000\u0001\uff27\u43ad\uff27\u43ad\u0001\u0000\u0000\u0001\uff27\u43ad\u1409\u0000", new Object[] { "b", "c" });
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
