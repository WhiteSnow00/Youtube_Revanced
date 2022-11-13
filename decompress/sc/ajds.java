import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajds extends ahbh implements ahcw
{
    public static final ajds a;
    private static volatile ahdd b;
    private int c;
    private ajdw d;
    private ajdu e;
    private ahhu f;
    private anuv g;
    private anuv h;
    private anuv i;
    private anuv j;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajds.class, (ahbh)(a = new ajds()));
    }
    
    private ajds() {
        this.l = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
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
                if ((b = ajds.b) == null) {
                    synchronized (ajds.class) {
                        if (ajds.b == null) {
                            ajds.b = (ahdd)new ahba((ahbh)ajds.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajds.a;
            }
            case 4: {
                return new ahaz((ahbh)ajds.a);
            }
            case 3: {
                return new ajds();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajds.a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\t\u1409\u0007\u000b\u1409\b\f\u1409\t\r\u1409\n\u000e\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
