import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbt extends ahbh implements ahcw
{
    public static final apbt a;
    private static volatile ahdd b;
    private ajut A;
    private ajut B;
    private ajut C;
    private byte D;
    private int c;
    private int d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private aiqj l;
    private amgv m;
    private anuv n;
    private ajut o;
    private aiae p;
    private aiae q;
    private anuv r;
    private anuv s;
    private anuv t;
    private aiae u;
    private anuv v;
    private ahhu w;
    private ajut x;
    private ajut y;
    private ajut z;
    
    static {
        ahbh.registerDefaultInstance((Class)apbt.class, (ahbh)(a = new apbt()));
    }
    
    private apbt() {
        this.D = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = apbt.b) == null) {
                    synchronized (apbt.class) {
                        if (apbt.b == null) {
                            apbt.b = (ahdd)new ahba((ahbh)apbt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbt.a;
            }
            case 4: {
                return new ahaz((ahbh)apbt.a);
            }
            case 3: {
                return new apbt();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbt.a, "\u0001\u0019\u0000\u0002\u0002!\u0019\u0000\u0000\u0019\u0002\u1409\u001b\u0003\u1409\u001c\u0004\u1409\u001d\u0005\u1409\u001e\u0006\u1409 \u0007\u1409\n\b\u1409\u000f\n\u1409\u001a\f\u1409\u0003\u000f\u1409\u001f\u0010\u1409\u0004\u0011\u1409\u0005\u0012\u1409\u0006\u0013\u1409\u0010\u0015\u1409\t\u0016\u1409\u000b\u0017\u1409\u0007\u0019\u1409\u0014\u001a\u1409\f\u001b\u1409\u0011\u001d\u1409\u0016\u001e\u1409\u0012\u001f\u1409\b \u1409\u0017!\u1409\u0018", new Object[] { "c", "d", "x", "y", "z", "A", "C", "l", "o", "w", "e", "B", "f", "g", "h", "p", "k", "m", "i", "s", "n", "q", "t", "r", "j", "u", "v" });
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
