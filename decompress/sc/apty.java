import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apty extends ahbh implements ahcw
{
    public static final apty a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private anuv h;
    private ahhu i;
    private aptx j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apty.class, (ahbh)(a = new apty()));
    }
    
    private apty() {
        this.k = 2;
        ahbh.emptyProtobufList();
        emptyProtobufList();
        ahbh.emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = apty.b) == null) {
                    synchronized (apty.class) {
                        if (apty.b == null) {
                            apty.b = (ahdd)new ahba((ahbh)apty.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apty.a;
            }
            case 4: {
                return new ahaz((ahbh)apty.a);
            }
            case 3: {
                return new apty();
            }
            case 2: {
                return newMessageInfo((MessageLite)apty.a, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\t\u0010\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
