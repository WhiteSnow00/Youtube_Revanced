import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsa extends ahbh implements ahcw
{
    public static final apsa a;
    private static volatile ahdd c;
    public aipg b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apsa.class, (ahbh)(a = new apsa()));
    }
    
    private apsa() {
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
                if ((c = apsa.c) == null) {
                    synchronized (apsa.class) {
                        if (apsa.c == null) {
                            apsa.c = (ahdd)new ahba((ahbh)apsa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsa.a;
            }
            case 4: {
                return new ahaz((ahbh)apsa.a);
            }
            case 3: {
                return new apsa();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
