import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojw extends ahbh implements ahcw
{
    public static final aojw a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aojw.class, (ahbh)(a = new aojw()));
    }
    
    private aojw() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aojw.b) == null) {
                    synchronized (aojw.class) {
                        if (aojw.b == null) {
                            aojw.b = (ahdd)new ahba((ahbh)aojw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojw.a;
            }
            case 4: {
                return new ahaz((ahbh)aojw.a);
            }
            case 3: {
                return new aojw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojw.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0001\u0005\u1409\u0000", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
