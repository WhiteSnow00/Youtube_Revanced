import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkp extends ahbh implements ahcw
{
    public static final amkp a;
    private static volatile ahdd e;
    public ajut b;
    public ajut c;
    public aida d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)amkp.class, (ahbh)(a = new amkp()));
    }
    
    private amkp() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amkp.e) == null) {
                    synchronized (amkp.class) {
                        if (amkp.e == null) {
                            amkp.e = (ahdd)new ahba((ahbh)amkp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkp.a;
            }
            case 4: {
                return new ahaz((ahbh)amkp.a);
            }
            case 3: {
                return new amkp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
