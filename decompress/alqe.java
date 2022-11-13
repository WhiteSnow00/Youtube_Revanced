import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqe extends ahbh implements ahcw
{
    public static final alqe a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private aida e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alqe.class, (ahbh)(a = new alqe()));
    }
    
    private alqe() {
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
                final ahdd c;
                if ((c = alqe.c) == null) {
                    synchronized (alqe.class) {
                        if (alqe.c == null) {
                            alqe.c = (ahdd)new ahba((ahbh)alqe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alqe.a;
            }
            case 4: {
                return new ahaz((ahbh)alqe.a);
            }
            case 3: {
                return new alqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqe.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0002\u0003\u1409\u0003", new Object[] { "d", "e", "b" });
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
