import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojj extends ahbh implements ahcw
{
    public static final aojj a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aojj.class, (ahbh)(a = new aojj()));
    }
    
    private aojj() {
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
                if ((b = aojj.b) == null) {
                    synchronized (aojj.class) {
                        if (aojj.b == null) {
                            aojj.b = (ahdd)new ahba((ahbh)aojj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojj.a;
            }
            case 4: {
                return new ahaz((ahbh)aojj.a);
            }
            case 3: {
                return new aojj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojj.a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0005\u1409\u0004\u0007\u1409\u0006\t\u1409\u0007\f\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h" });
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
