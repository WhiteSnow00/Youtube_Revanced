import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annd extends ahbh implements ahcw
{
    public static final annd a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private anuv g;
    private ajut h;
    private anuv i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)annd.class, (ahbh)(a = new annd()));
    }
    
    private annd() {
        this.k = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annd.b) == null) {
                    synchronized (annd.class) {
                        if (annd.b == null) {
                            annd.b = (ahdd)new ahba((ahbh)annd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annd.a;
            }
            case 4: {
                return new ahaz((ahbh)annd.a);
            }
            case 3: {
                return new annd();
            }
            case 2: {
                return newMessageInfo((MessageLite)annd.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}