import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwz extends ahbh implements ahcw
{
    public static final akwz a;
    private static volatile ahdd r;
    public int b;
    public int c;
    public String d;
    public String e;
    public akwx f;
    public akwy g;
    public akww h;
    public anuv i;
    public akwq j;
    public akwp k;
    public akwu l;
    public amzc m;
    public akxq n;
    public akwt o;
    public ahab p;
    public ahab q;
    private akxn s;
    private anuv t;
    private aoxl u;
    private byte v;
    
    static {
        ahbh.registerDefaultInstance((Class)akwz.class, (ahbh)(a = new akwz()));
    }
    
    private akwz() {
        this.v = 2;
        this.d = "";
        this.e = "";
        emptyProtobufList();
        ahbh.emptyProtobufList();
        this.p = ahab.b;
        this.q = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = akwz.r) == null) {
                    synchronized (akwz.class) {
                        if (akwz.r == null) {
                            akwz.r = (ahdd)new ahba((ahbh)akwz.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return akwz.a;
            }
            case 4: {
                return new ahaz((ahbh)akwz.a);
            }
            case 3: {
                return new akwz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwz.a, "\u0001\u0012\u0000\u0001\u0001\"\u0012\u0000\u0000\f\u0001\u100c\u0000\u0002\u1008\u0002\b\u1409\u0006\n\u1409\u000f\u000b\u1409\u000b\r\u1409\u0012\u0010\u1409\f\u0011\u1009\u0004\u0012\u1409\u0013\u0013\u1409\u0014\u0015\u1409\t\u0016\u1008\u0003\u0018\u1409\n\u0019\u1409\u0016\u001f\u100a\u0018 \u100a\u0019!\u1409\u001a\"\u1409\u0010", new Object[] { "b", "c", anci.b, "d", "g", "l", "j", "n", "k", "f", "o", "s", "h", "e", "i", "t", "p", "q", "u", "m" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
