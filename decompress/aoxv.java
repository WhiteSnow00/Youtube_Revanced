import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxv extends ahbh implements ahcw
{
    public static final aoxv a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private aiqj i;
    private ahhu j;
    private amgv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxv.class, (ahbh)(a = new aoxv()));
    }
    
    private aoxv() {
        this.l = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoxv.b) == null) {
                    synchronized (aoxv.class) {
                        if (aoxv.b == null) {
                            aoxv.b = (ahdd)new ahba((ahbh)aoxv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxv.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxv.a);
            }
            case 3: {
                return new aoxv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxv.a, "\u0001\b\u0000\u0001\u0003\u000e\b\u0000\u0000\b\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\b\u000b\u1409\u0007\f\u1409\u0005\u000e\u1409\n", new Object[] { "c", "d", "e", "f", "h", "j", "i", "g", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
