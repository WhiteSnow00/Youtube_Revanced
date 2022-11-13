import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifb extends ahbh implements ahcw
{
    public static final aifb a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aifb.class, (ahbh)(a = new aifb()));
    }
    
    private aifb() {
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
                if ((b = aifb.b) == null) {
                    synchronized (aifb.class) {
                        if (aifb.b == null) {
                            aifb.b = (ahdd)new ahba((ahbh)aifb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifb.a;
            }
            case 4: {
                return new ahaz((ahbh)aifb.a);
            }
            case 3: {
                return new aifb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifb.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0003\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "f", "d", "e" });
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
