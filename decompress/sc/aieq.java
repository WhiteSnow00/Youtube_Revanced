import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieq extends ahbh implements ahcw
{
    public static final aieq a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private aies e;
    private anuv f;
    private ahhu g;
    private aiqj h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aieq.class, (ahbh)(a = new aieq()));
    }
    
    private aieq() {
        this.i = 2;
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
                if ((b = aieq.b) == null) {
                    synchronized (aieq.class) {
                        if (aieq.b == null) {
                            aieq.b = (ahdd)new ahba((ahbh)aieq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieq.a;
            }
            case 4: {
                return new ahaz((ahbh)aieq.a);
            }
            case 3: {
                return new aieq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieq.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0005\u0005\u1409\u0002\u0007\u1409\u0003\t\u1409\u0007", new Object[] { "c", "d", "g", "e", "f", "h" });
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
