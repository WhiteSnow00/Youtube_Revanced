import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqj extends ahbh implements ahcw
{
    public static final alqj a;
    private static volatile ahdd o;
    public int b;
    public int c;
    public Object d;
    public String e;
    public String f;
    public ajut g;
    public ajut h;
    public ajut i;
    public aotp j;
    public ahbx k;
    public ajut l;
    public aiqj m;
    public ahab n;
    private ajut p;
    private ajut q;
    private ajut r;
    private anuv s;
    private ahhu t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)alqj.class, (ahbh)(a = new alqj()));
    }
    
    private alqj() {
        this.c = 0;
        this.u = 2;
        this.e = "";
        this.f = "";
        this.k = emptyProtobufList();
        emptyProtobufList();
        this.n = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = alqj.o) == null) {
                    synchronized (alqj.class) {
                        if (alqj.o == null) {
                            alqj.o = (ahdd)new ahba((ahbh)alqj.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alqj.a;
            }
            case 4: {
                return new ahaz((ahbh)alqj.a);
            }
            case 3: {
                return new alqj();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqj.a, "\u0001\u0012\u0001\u0001\u0001\u0015\u0012\u0000\u0001\u000e\u0001\u1008\u0000\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u103a\u0000\b\u143c\u0000\t\u143c\u0000\n\u1409\t\u000b\u1409\n\f\u041b\r\u1409\u000b\u000e\u1409\f\u000f\u1409\u000e\u0012\u1409\u0011\u0013\u100a\u0012\u0014\u1409\u0010\u0015\u1409\r", new Object[] { "d", "c", "b", "e", "p", "f", "g", "h", ajut.class, alrg.class, "i", "j", "k", alpl.class, "l", "q", "m", "t", "n", "s", "r" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
