import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammf extends ahbh implements ahcw
{
    public static final ammf a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private anuv e;
    private ajut f;
    private ajut g;
    private anuv h;
    private aiqj i;
    private anuv j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ammf.class, (ahbh)(a = new ammf()));
    }
    
    private ammf() {
        this.k = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ammf.b) == null) {
                    synchronized (ammf.class) {
                        if (ammf.b == null) {
                            ammf.b = (ahdd)new ahba((ahbh)ammf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ammf.a;
            }
            case 4: {
                return new ahaz((ahbh)ammf.a);
            }
            case 3: {
                return new ammf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ammf.a, "\u0001\u0007\u0000\u0001\u0006\u0012\u0007\u0000\u0000\u0007\u0006\u1409\u0001\u000b\u1409\u0002\f\u1409\u0003\r\u1409\u0004\u0010\u1409\u0005\u0011\u1409\u0006\u0012\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
