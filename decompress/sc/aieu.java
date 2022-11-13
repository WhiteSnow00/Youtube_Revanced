import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieu extends ahbh implements ahcw
{
    public static final aieu a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private anuv g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aieu.class, (ahbh)(a = new aieu()));
    }
    
    private aieu() {
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
                if ((b = aieu.b) == null) {
                    synchronized (aieu.class) {
                        if (aieu.b == null) {
                            aieu.b = (ahdd)new ahba((ahbh)aieu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieu.a;
            }
            case 4: {
                return new ahaz((ahbh)aieu.a);
            }
            case 3: {
                return new aieu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
