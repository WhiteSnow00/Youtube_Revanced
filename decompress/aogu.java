import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogu extends ahbh implements ahcw
{
    public static final aogu a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aogu.class, (ahbh)(a = new aogu()));
    }
    
    private aogu() {
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
                if ((c = aogu.c) == null) {
                    synchronized (aogu.class) {
                        if (aogu.c == null) {
                            aogu.c = (ahdd)new ahba((ahbh)aogu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aogu.a;
            }
            case 4: {
                return new ahaz((ahbh)aogu.a);
            }
            case 3: {
                return new aogu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "e", "b" });
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
