import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqo extends ahbh implements ahcw
{
    public static final alqo a;
    private static volatile ahdd p;
    public int b;
    public String c;
    public long d;
    public ajut e;
    public String f;
    public ajut g;
    public ajut h;
    public aotp i;
    public ahbx j;
    public ajut k;
    public ajut l;
    public aiqj m;
    public ahab n;
    public int o;
    private ajut q;
    private ahhu r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)alqo.class, (ahbh)(a = new alqo()));
    }
    
    private alqo() {
        this.s = 2;
        this.c = "";
        this.f = "";
        this.j = emptyProtobufList();
        emptyProtobufList();
        this.n = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = alqo.p) == null) {
                    synchronized (alqo.class) {
                        if (alqo.p == null) {
                            alqo.p = (ahdd)new ahba((ahbh)alqo.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return alqo.a;
            }
            case 4: {
                return new ahaz((ahbh)alqo.a);
            }
            case 3: {
                return new alqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqo.a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\n\u0001\u1409\u0004\u0002\u1409\u0005\u0003\u1409\u0006\u0004\u1409\u000b\u0005\u1008\u0000\u0006\u1003\u0001\u0007\u041b\b\u1008\u0003\t\u1409\b\n\u1409\t\r\u1409\u0002\u000e\u1409\r\u000f\u100a\u000e\u0010\u100c\u000f\u0011\u1409\n", new Object[] { "b", "g", "h", "i", "m", "c", "d", "j", alpl.class, "f", "k", "l", "e", "r", "n", "o", alnf.l, "q" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
