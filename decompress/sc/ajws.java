import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajws extends ahbh implements ahcw
{
    public static final ajws a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private ajut e;
    private ajut f;
    private ajxd g;
    private amgd h;
    private anuv i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajws.class, (ahbh)(a = new ajws()));
    }
    
    private ajws() {
        this.j = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajws.b) == null) {
                    synchronized (ajws.class) {
                        if (ajws.b == null) {
                            ajws.b = (ahdd)new ahba((ahbh)ajws.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajws.a;
            }
            case 4: {
                return new ahaz((ahbh)ajws.a);
            }
            case 3: {
                return new ajws();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajws.a, "\u0001\u0006\u0000\u0001\u0002\u0013\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0004\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0005\r\u1409\b\u0013\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
