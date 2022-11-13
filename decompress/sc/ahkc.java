import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkc extends ahbh implements ahcw
{
    public static final ahkc a;
    private static volatile ahdd e;
    public ajut b;
    public ajut c;
    public ajmr d;
    private int f;
    private ajut g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkc.class, (ahbh)(a = new ahkc()));
    }
    
    private ahkc() {
        this.i = 2;
        emptyProtobufList();
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
                final ahdd e;
                if ((e = ahkc.e) == null) {
                    synchronized (ahkc.class) {
                        if (ahkc.e == null) {
                            ahkc.e = (ahdd)new ahba((ahbh)ahkc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahkc.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkc.a);
            }
            case 3: {
                return new ahkc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkc.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004", new Object[] { "f", "g", "b", "c", "h", "d" });
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
