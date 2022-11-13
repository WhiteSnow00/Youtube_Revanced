import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amig extends ahbh implements ahcw
{
    public static final amig a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private alob g;
    private aiqj h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)amig.class, (ahbh)(a = new amig()));
    }
    
    private amig() {
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
                final ahdd b;
                if ((b = amig.b) == null) {
                    synchronized (amig.class) {
                        if (amig.b == null) {
                            amig.b = (ahdd)new ahba((ahbh)amig.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amig.a;
            }
            case 4: {
                return new ahaz((ahbh)amig.a);
            }
            case 3: {
                return new amig();
            }
            case 2: {
                return newMessageInfo((MessageLite)amig.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
