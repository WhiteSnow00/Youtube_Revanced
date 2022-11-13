import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aket extends ahbh implements ahcw
{
    public static final aket a;
    private static volatile ahdd c;
    public akfb b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aket.class, (ahbh)(a = new aket()));
    }
    
    private aket() {
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
                if ((c = aket.c) == null) {
                    synchronized (aket.class) {
                        if (aket.c == null) {
                            aket.c = (ahdd)new ahba((ahbh)aket.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aket.a;
            }
            case 4: {
                return new ahaz((ahbh)aket.a);
            }
            case 3: {
                return new aket();
            }
            case 2: {
                return newMessageInfo((MessageLite)aket.a, "\u0001\u0001\u0000\u0001\ue084\u1d9f\ue084\u1d9f\u0001\u0000\u0000\u0001\ue084\u1d9f\u1409\u0000", new Object[] { "d", "b" });
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
