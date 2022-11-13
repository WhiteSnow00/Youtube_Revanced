import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojy extends ahbh implements ahcw
{
    public static final aojy a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojy.class, (ahbh)(a = new aojy()));
    }
    
    private aojy() {
        this.g = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = aojy.b) == null) {
                    synchronized (aojy.class) {
                        if (aojy.b == null) {
                            aojy.b = (ahdd)new ahba((ahbh)aojy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojy.a;
            }
            case 4: {
                return new ahaz((ahbh)aojy.a);
            }
            case 3: {
                return new aojy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojy.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0001", new Object[] { "c", "d", "f", "e" });
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
