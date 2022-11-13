import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkz extends ahbh implements ahcw
{
    public static final amkz a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aida g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private ajut l;
    private ajut m;
    private ajut n;
    private aiqj o;
    private aiao p;
    private aiao q;
    private aiao r;
    private ahre s;
    private alkp t;
    private amgv u;
    private ahhu v;
    private aida w;
    private byte x;
    
    static {
        ahbh.registerDefaultInstance((Class)amkz.class, (ahbh)(a = new amkz()));
    }
    
    private amkz() {
        this.x = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amkz.b) == null) {
                    synchronized (amkz.class) {
                        if (amkz.b == null) {
                            amkz.b = (ahdd)new ahba((ahbh)amkz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkz.a;
            }
            case 4: {
                return new ahaz((ahbh)amkz.a);
            }
            case 3: {
                return new amkz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkz.a, "\u0001\u0014\u0000\u0001\u0003$\u0014\u0000\u0000\u0014\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0007\u1409\t\b\u1409\n\t\u1409\f\n\u1409\r\u000b\u1409\u000f\u000e\u1409\u0013\u0010\u1409\u0017\u0012\u1409\u000b\u0013\u1409\u0014\u0015\u1409\u000e\u0016\u1409\u0015\u0018\u1409\u0010\u0019\u1409\u0011\u001a\u1409\u0012\u001c\u1409\u0003!\u1409\u0005$\u1409\u001b", new Object[] { "c", "d", "f", "h", "i", "j", "l", "m", "o", "s", "v", "k", "t", "n", "u", "p", "q", "r", "e", "g", "w" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
