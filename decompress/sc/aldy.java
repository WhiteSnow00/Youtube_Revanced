import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldy extends ahbh implements ahcw
{
    public static final aldy a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aldy.class, (ahbh)(a = new aldy()));
    }
    
    private aldy() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aldy.b) == null) {
                    synchronized (aldy.class) {
                        if (aldy.b == null) {
                            aldy.b = (ahdd)new ahba((ahbh)aldy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aldy.a;
            }
            case 4: {
                return new ahaz((ahbh)aldy.a);
            }
            case 3: {
                return new aldy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldy.a, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0002\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
