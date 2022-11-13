import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovo extends ahbh implements ahcw
{
    public static final aovo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aida f;
    private aida g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aovo.class, (ahbh)(a = new aovo()));
    }
    
    private aovo() {
        this.i = 2;
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
                if ((b = aovo.b) == null) {
                    synchronized (aovo.class) {
                        if (aovo.b == null) {
                            aovo.b = (ahdd)new ahba((ahbh)aovo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovo.a;
            }
            case 4: {
                return new ahaz((ahbh)aovo.a);
            }
            case 3: {
                return new aovo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovo.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0001", new Object[] { "c", "d", "f", "g", "h", "e" });
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
