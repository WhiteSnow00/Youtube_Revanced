import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbv extends ahbh implements ahcw
{
    public static final apbv a;
    private static volatile ahdd b;
    private ajut A;
    private ajut B;
    private ajut C;
    private byte D;
    private int c;
    private int d;
    private ajut e;
    private anuv f;
    private ajut g;
    private aiqj h;
    private apex i;
    private aida j;
    private aida k;
    private apbw l;
    private ajut m;
    private ajut n;
    private ajut o;
    private aiae p;
    private ajut q;
    private ahhu r;
    private ajut s;
    private aiqj t;
    private ajut u;
    private ajut v;
    private ajut w;
    private ajut x;
    private ajut y;
    private ajut z;
    
    static {
        ahbh.registerDefaultInstance((Class)apbv.class, (ahbh)(a = new apbv()));
    }
    
    private apbv() {
        this.D = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbv.b) == null) {
                    synchronized (apbv.class) {
                        if (apbv.b == null) {
                            apbv.b = (ahdd)new ahba((ahbh)apbv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbv.a;
            }
            case 4: {
                return new ahaz((ahbh)apbv.a);
            }
            case 3: {
                return new apbv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbv.a, "\u0001\u0019\u0000\u0002\u0002#\u0019\u0000\u0000\u0019\u0002\u1409\u0014\u0003\u1409\u0000\u0004\u1409\u0015\u0007\u1409 \b\u1409!\n\u1409\u0006\u000b\u1409\u001c\f\u1409\u001d\r\u1409\u0016\u000f\u1409\u0018\u0010\u1409\u001e\u0011\u1409\u001a\u0012\u1409\u001b\u0013\u1409\u0019\u0015\u1409\n\u0016\u1409\u0003\u0018\u1409\u0005\u0019\u1409\u000b\u001a\u1409\f\u001c\u1409\r\u001d\u1409\u000e\u001e\u1409\u000f\u001f\u1409\b\"\u1409\t#\u1409\u0001", new Object[] { "c", "d", "r", "e", "s", "B", "C", "i", "y", "z", "t", "u", "A", "w", "x", "v", "l", "g", "h", "m", "n", "o", "p", "q", "j", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.D = d;
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
