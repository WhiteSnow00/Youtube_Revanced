import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxg extends ahbh implements ahcw
{
    public static final ajxg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private apfs l;
    private amgv m;
    private ajxb n;
    private ajxf o;
    private ahhu p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxg.class, (ahbh)(a = new ajxg()));
    }
    
    private ajxg() {
        this.q = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = ajxg.b) == null) {
                    synchronized (ajxg.class) {
                        if (ajxg.b == null) {
                            ajxg.b = (ahdd)new ahba((ahbh)ajxg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxg.a);
            }
            case 3: {
                return new ajxg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxg.a, "\u0001\r\u0000\u0001\u0003\u0015\r\u0000\u0000\r\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b\u0010\u1409\f\u0011\u1409\r\u0014\u1409\u0011\u0015\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "o" });
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
