import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieg extends ahbh implements ahcw
{
    public static final aieg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private aiqj h;
    private aida i;
    private aida j;
    private aida k;
    private aiqj l;
    private aiqj m;
    private aiqj n;
    private ahhu o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)aieg.class, (ahbh)(a = new aieg()));
    }
    
    private aieg() {
        this.p = 2;
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
                if ((b = aieg.b) == null) {
                    synchronized (aieg.class) {
                        if (aieg.b == null) {
                            aieg.b = (ahdd)new ahba((ahbh)aieg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieg.a;
            }
            case 4: {
                return new ahaz((ahbh)aieg.a);
            }
            case 3: {
                return new aieg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieg.a, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000b\r\u1409\u0010\u000f\u1409\u0014\u0013\u1409\u0011\u0014\u1409\u0012\u0016\u1409\u0006", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "l", "o", "m", "n", "g" });
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
