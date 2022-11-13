import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfg extends ahbh implements ahcw
{
    public static final ajfg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private anuv h;
    private anuv i;
    private anuv j;
    private anuv k;
    private anuv l;
    private aiqj m;
    private ahhu n;
    private ahmo o;
    private ajut p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfg.class, (ahbh)(a = new ajfg()));
    }
    
    private ajfg() {
        this.q = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajfg.b) == null) {
                    synchronized (ajfg.class) {
                        if (ajfg.b == null) {
                            ajfg.b = (ahdd)new ahba((ahbh)ajfg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajfg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfg.a);
            }
            case 3: {
                return new ajfg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfg.a, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\r\u0001\u1409\f\u0004\u1409\u0001\u0006\u1409\u0003\u0007\u1409\u0004\b\u1409\u0006\t\u1409\u0007\n\u1409\b\f\u1409\u000b\r\u1409\u000e\u000e\u1409\t\u000f\u1409\n\u0010\u1409\u0005\u0011\u1409\u000f", new Object[] { "c", "n", "d", "e", "f", "h", "i", "j", "m", "o", "k", "l", "g", "p" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
