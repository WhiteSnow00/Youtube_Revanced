import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwi extends ahbh implements ahcw
{
    public static final ajwi a;
    private static volatile ahdd l;
    public int b;
    public aotp c;
    public aotp d;
    public aida e;
    public ajut f;
    public ahbx g;
    public String h;
    public aotp i;
    public akdi j;
    public aida k;
    private ajut m;
    private ajut n;
    private aida o;
    private ajut p;
    private anuv q;
    private anuv r;
    private ajut s;
    private aiqj t;
    private aiqj u;
    private ahhu v;
    private byte w;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwi.class, (ahbh)(a = new ajwi()));
    }
    
    private ajwi() {
        this.w = 2;
        this.g = emptyProtobufList();
        this.h = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ajwi.l) == null) {
                    synchronized (ajwi.class) {
                        if (ajwi.l == null) {
                            ajwi.l = (ahdd)new ahba((ahbh)ajwi.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajwi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwi.a);
            }
            case 3: {
                return new ajwi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwi.a, "\u0001\u0013\u0000\u0001\u0002\u0015\u0013\u0000\u0001\u0012\u0002\u1409\u0014\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b\u000b\u041b\f\u1409\t\r\u1008\n\u000e\u1409\u000b\u000f\u1409\f\u0010\u1409\r\u0011\u1409\u000e\u0012\u1409\u000f\u0013\u1409\u0010\u0014\u1409\u0011\u0015\u1409\u0012", new Object[] { "b", "v", "c", "d", "m", "n", "e", "o", "f", "g", ajut.class, "p", "h", "q", "r", "s", "i", "j", "k", "t", "u" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
