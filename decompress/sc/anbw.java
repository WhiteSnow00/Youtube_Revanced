import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbw extends ahbh implements ahcw
{
    public static final anbw a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private aiao i;
    private aiao j;
    private aiao k;
    private ahhu l;
    private ajut m;
    private ajut n;
    private amgv o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)anbw.class, (ahbh)(a = new anbw()));
    }
    
    private anbw() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anbw.b) == null) {
                    synchronized (anbw.class) {
                        if (anbw.b == null) {
                            anbw.b = (ahdd)new ahba((ahbh)anbw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anbw.a;
            }
            case 4: {
                return new ahaz((ahbh)anbw.a);
            }
            case 3: {
                return new anbw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbw.a, "\u0001\f\u0000\u0001\u0003\u0012\f\u0000\u0000\f\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\t\u1409\n\u000b\u1409\f\f\u1409\b\u000e\u1409\u000e\u000f\u1409\u0007\u0010\u1409\t\u0012\u1409\u000f", new Object[] { "c", "d", "e", "f", "g", "h", "l", "m", "j", "n", "i", "k", "o" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
