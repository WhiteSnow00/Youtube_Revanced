import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anol extends ahbh implements ahcw
{
    public static final anol a;
    private static volatile ahdd b;
    private int c;
    private aiae d;
    private ajut e;
    private anoi f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anol.class, (ahbh)(a = new anol()));
    }
    
    private anol() {
        this.g = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anol.b) == null) {
                    synchronized (anol.class) {
                        if (anol.b == null) {
                            anol.b = (ahdd)new ahba((ahbh)anol.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anol.a;
            }
            case 4: {
                return new ahaz((ahbh)anol.a);
            }
            case 3: {
                return new anol();
            }
            case 2: {
                return newMessageInfo((MessageLite)anol.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
