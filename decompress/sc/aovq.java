import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovq extends ahbh implements ahcw
{
    public static final aovq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aovq.class, (ahbh)(a = new aovq()));
    }
    
    private aovq() {
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
                if ((b = aovq.b) == null) {
                    synchronized (aovq.class) {
                        if (aovq.b == null) {
                            aovq.b = (ahdd)new ahba((ahbh)aovq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovq.a;
            }
            case 4: {
                return new ahaz((ahbh)aovq.a);
            }
            case 3: {
                return new aovq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovq.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
