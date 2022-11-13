import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkr extends ahbh implements ahcw
{
    public static final ahkr a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private anuv g;
    private anuv h;
    private anuv i;
    private anuv j;
    private aiqj k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkr.class, (ahbh)(a = new ahkr()));
    }
    
    private ahkr() {
        this.m = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahkr.b) == null) {
                    synchronized (ahkr.class) {
                        if (ahkr.b == null) {
                            ahkr.b = (ahdd)new ahba((ahbh)ahkr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahkr.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkr.a);
            }
            case 3: {
                return new ahkr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkr.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0007\u0007\u1409\u000b\n\u1409\u0006\u000b\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "k", "l", "j", "d" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
