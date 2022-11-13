import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajea extends ahbh implements ahcw
{
    public static final ajea a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private anuv e;
    private anuv f;
    private ajut g;
    private ajut h;
    private ajut i;
    private aijz j;
    private anuv k;
    private anuv l;
    private anuv m;
    private anuv n;
    private ahhu o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)ajea.class, (ahbh)(a = new ajea()));
    }
    
    private ajea() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                if ((b = ajea.b) == null) {
                    synchronized (ajea.class) {
                        if (ajea.b == null) {
                            ajea.b = (ahdd)new ahba((ahbh)ajea.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajea.a;
            }
            case 4: {
                return new ahaz((ahbh)ajea.a);
            }
            case 3: {
                return new ajea();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajea.a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\r\u1409\n\u000e\u1409\u000b\u000f\u1409\u0005\u0010\u1409\f\u0012\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "h", "n", "o" });
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
