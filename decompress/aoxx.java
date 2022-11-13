import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxx extends ahbh implements ahcw
{
    public static final aoxx a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private aoxy g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxx.class, (ahbh)(a = new aoxx()));
    }
    
    private aoxx() {
        this.i = 2;
        final ahab b = ahab.b;
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
                if ((b = aoxx.b) == null) {
                    synchronized (aoxx.class) {
                        if (aoxx.b == null) {
                            aoxx.b = (ahdd)new ahba((ahbh)aoxx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxx.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxx.a);
            }
            case 3: {
                return new aoxx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxx.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0002", new Object[] { "c", "d", "e", "g", "h", "f" });
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
