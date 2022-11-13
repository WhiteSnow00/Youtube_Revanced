import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldb extends ahbh implements ahcw
{
    public static final aldb a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private aiqj e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aldb.class, (ahbh)(a = new aldb()));
    }
    
    private aldb() {
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
                if ((c = aldb.c) == null) {
                    synchronized (aldb.class) {
                        if (aldb.c == null) {
                            aldb.c = (ahdd)new ahba((ahbh)aldb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aldb.a;
            }
            case 4: {
                return new ahaz((ahbh)aldb.a);
            }
            case 3: {
                return new aldb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldb.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "d", "e", "b" });
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
