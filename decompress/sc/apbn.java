import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbn extends ahbh implements ahcw
{
    public static final apbn a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private ajut l;
    private amgv m;
    private aiqj n;
    private aiae o;
    private aiae p;
    private aiae q;
    private aiae r;
    private ahhu s;
    private byte t;
    
    static {
        ahbh.registerDefaultInstance((Class)apbn.class, (ahbh)(a = new apbn()));
    }
    
    private apbn() {
        this.t = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbn.b) == null) {
                    synchronized (apbn.class) {
                        if (apbn.b == null) {
                            apbn.b = (ahdd)new ahba((ahbh)apbn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbn.a;
            }
            case 4: {
                return new ahaz((ahbh)apbn.a);
            }
            case 3: {
                return new apbn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbn.a, "\u0001\u0010\u0000\u0001\u0003\u001b\u0010\u0000\u0000\u0010\u0003\u1409\t\u0004\u1409\n\u0005\u1409\u000b\u0006\u1409\f\u0007\u1409\r\b\u1409\u000e\t\u1409\u000f\u000b\u1409\u0019\r\u1409\u0011\u000e\u1409\u0005\u000f\u1409\u0006\u0012\u1409\u0007\u0017\u1409\u0012\u0018\u1409\u0014\u0019\u1409\b\u001b\u1409\u0015", new Object[] { "c", "h", "i", "j", "k", "l", "m", "n", "s", "o", "d", "e", "f", "p", "q", "g", "r" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
