import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrj extends ahbh implements ahcw
{
    public static final alrj a;
    private static volatile ahdd p;
    public int b;
    public String c;
    public aiqj d;
    public aotp e;
    public ajut f;
    public int g;
    public int h;
    public int i;
    public ajut j;
    public String k;
    public ajut l;
    public aotp m;
    public int n;
    public int o;
    private ajut q;
    private ajut r;
    private ajut s;
    private ahhu t;
    private anuv u;
    private byte v;
    
    static {
        ahbh.registerDefaultInstance((Class)alrj.class, (ahbh)(a = new alrj()));
    }
    
    private alrj() {
        this.v = 2;
        this.c = "";
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        final ahab b = ahab.b;
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
                final ahdd p3;
                if ((p3 = alrj.p) == null) {
                    synchronized (alrj.class) {
                        if (alrj.p == null) {
                            alrj.p = (ahdd)new ahba((ahbh)alrj.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return alrj.a;
            }
            case 4: {
                return new ahaz((ahbh)alrj.a);
            }
            case 3: {
                return new alrj();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrj.a, "\u0001\u0012\u0000\u0001\u0001\u001a\u0012\u0000\u0000\u000b\u0001\u1008\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u1409\u0005\b\u1008\f\t\u1409\r\u000b\u1409\u0010\r\u1409\u000e\u000e\u1409\u0013\u000f\u1409\u0014\u0011\u100b\t\u0012\u1409\n\u0013\u1004\u0011\u0014\u1004\u0012\u0016\u100b\u0007\u0017\u100b\u0006\u0018\u1409\u0015\u001a\u1409\u0017", new Object[] { "b", "c", "d", "e", "f", "k", "q", "m", "l", "r", "s", "i", "j", "n", "o", "h", "g", "t", "u" });
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
