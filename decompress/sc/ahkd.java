import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkd extends ahbh implements ahcw
{
    public static final ahkd a;
    private static volatile ahdd b;
    private int c;
    private ahnk d;
    private ahlj e;
    private anuv f;
    private aiqj g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkd.class, (ahbh)(a = new ahkd()));
    }
    
    private ahkd() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = ahkd.b) == null) {
                    synchronized (ahkd.class) {
                        if (ahkd.b == null) {
                            ahkd.b = (ahdd)new ahba((ahbh)ahkd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahkd.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkd.a);
            }
            case 3: {
                return new ahkd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkd.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0007\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
