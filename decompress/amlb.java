import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlb extends ahbh implements ahcw
{
    public static final amlb a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private aiqj e;
    private aiqj f;
    private ajut g;
    private anuv h;
    private anuv i;
    private amgv j;
    private anuv k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)amlb.class, (ahbh)(a = new amlb()));
    }
    
    private amlb() {
        this.m = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amlb.b) == null) {
                    synchronized (amlb.class) {
                        if (amlb.b == null) {
                            amlb.b = (ahdd)new ahba((ahbh)amlb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amlb.a;
            }
            case 4: {
                return new ahaz((ahbh)amlb.a);
            }
            case 3: {
                return new amlb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlb.a, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0000\t\u0002\u1409\u0000\u0004\u1409\u0003\u0006\u1409\n\u0007\u1409\r\t\u1409\u0005\f\u1409\t\u000f\u1409\u0001\u0010\u1409\u0006\u0011\u1409\u0002", new Object[] { "c", "d", "g", "k", "l", "h", "j", "e", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
