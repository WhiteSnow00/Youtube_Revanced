import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxa extends ahbh implements ahcw
{
    public static final ajxa a;
    private static volatile ahdd b;
    private int c;
    private ankk d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private aiqj j;
    private ajut k;
    private amgv l;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxa.class, (ahbh)(a = new ajxa()));
    }
    
    private ajxa() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajxa.b) == null) {
                    synchronized (ajxa.class) {
                        if (ajxa.b == null) {
                            ajxa.b = (ahdd)new ahba((ahbh)ajxa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajxa.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxa.a);
            }
            case 3: {
                return new ajxa();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxa.a, "\u0001\n\u0000\u0001\u0002\u000f\n\u0000\u0000\n\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\f\u1409\t\u000f\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
