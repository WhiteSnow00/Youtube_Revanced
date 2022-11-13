import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfm extends ahbh implements ahcw
{
    private static volatile ahdd C;
    public static final ajfm a;
    public String A;
    public ahab B;
    private int D;
    private ajut E;
    private ajut F;
    private ajut G;
    private ajut H;
    private ajut I;
    private ajut J;
    private ahhu K;
    private byte L;
    public int b;
    public int c;
    public int d;
    public ajut e;
    public ajut f;
    public aotp g;
    public aida h;
    public float i;
    public ajut j;
    public ajut k;
    public ajut l;
    public ajut m;
    public aida n;
    public ajut o;
    public ajut p;
    public ajut q;
    public ahbx r;
    public ahbx s;
    public ajut t;
    public ajut u;
    public long v;
    public long w;
    public ajut x;
    public ajut y;
    public boolean z;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfm.class, (ahbh)(a = new ajfm()));
    }
    
    private ajfm() {
        this.L = 2;
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
        this.A = "";
        this.B = ahab.b;
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
                final ahdd c;
                if ((c = ajfm.C) == null) {
                    synchronized (ajfm.class) {
                        if (ajfm.C == null) {
                            ajfm.C = (ahdd)new ahba((ahbh)ajfm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajfm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfm.a);
            }
            case 3: {
                return new ajfm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfm.a, "\u0001!\u0000\u0002\u0001'!\u0000\u0002\u0019\u0001\u1409\u0006\u0002\u1409\u0007\u0003\u1409\b\u0004\u1409\n\u0005\u1001\u000b\u0006\u1409\f\u0007\u1409\r\b\u1409\u0010\t\u1409 \n\u100a!\f\u1409\u0014\r\u1409\t\u000e\u1409\u0011\u000f\u1409\u0012\u0010\u1409\u0013\u0013\u1409\u0015\u0014\u1409\u0016\u0015\u041b\u0016\u041b\u0017\u1409\u0017\u0018\u1409\u0018\u0019\u1002\u0019\u001a\u1002\u001a\u001b\u1409\u001b\u001c\u1409\u001c\u001d\u1409\u000e\u001f\u1409\u0001\"\u1409\u000f#\u1008\u001f$\u1409\u001d%\u1007\u001e&\u100b\u0004'\u100b\u0005", new Object[] { "b", "D", "e", "f", "g", "h", "i", "j", "k", "n", "K", "B", "G", "F", "o", "p", "q", "H", "I", "s", ajfo.class, "r", ajfk.class, "t", "u", "v", "w", "x", "J", "l", "E", "m", "A", "y", "z", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.L = l;
                return null;
            }
            case 0: {
                return this.L;
            }
        }
    }
}
