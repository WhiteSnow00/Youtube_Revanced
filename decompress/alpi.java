import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpi extends ahbh implements ahcw
{
    public static final alpi a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpi.class, (ahbh)(a = new alpi()));
    }
    
    private alpi() {
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
                final ahdd c;
                if ((c = alpi.c) == null) {
                    synchronized (alpi.class) {
                        if (alpi.c == null) {
                            alpi.c = (ahdd)new ahba((ahbh)alpi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alpi.a;
            }
            case 4: {
                return new ahaz((ahbh)alpi.a);
            }
            case 3: {
                return new alpi();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
