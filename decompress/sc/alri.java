import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alri extends ahbh implements ahcw
{
    public static final alri a;
    private static volatile ahdd s;
    private byte A;
    public int b;
    public int c;
    public Object d;
    public String e;
    public long f;
    public String g;
    public ajut h;
    public aotp i;
    public ajbr j;
    public ajut k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public aiqj q;
    public anuv r;
    private ajut t;
    private ajut u;
    private ajut v;
    private anuv w;
    private anuv x;
    private ahhu y;
    private alrh z;
    
    static {
        ahbh.registerDefaultInstance((Class)alri.class, (ahbh)(a = new alri()));
    }
    
    private alri() {
        this.c = 0;
        this.A = 2;
        this.e = "";
        this.g = "";
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte a2 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd s;
                if ((s = alri.s) == null) {
                    synchronized (alri.class) {
                        if (alri.s == null) {
                            alri.s = (ahdd)new ahba((ahbh)alri.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return alri.a;
            }
            case 4: {
                return new ahaz((ahbh)alri.a);
            }
            case 3: {
                return new alri();
            }
            case 2: {
                return newMessageInfo((MessageLite)alri.a, "\u0001\u0018\u0001\u0001\u0001\u001f\u0018\u0000\u0000\u000f\u0001\u1008\u0000\u0002\u1003\u0001\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\b\u0006\u103a\u0000\u0007\u143c\u0000\b\u143c\u0000\t\u100b\n\n\u100b\u000b\u000b\u100b\f\f\u100b\r\r\u1008\u0003\u000e\u100b\t\u000f\u1409\u0015\u0012\u1409\u0013\u0013\u1409\u0014\u0016\u1409\u0002\u0017\u1409\u0019\u0018\u1409\u001a\u001c\u1409\u001c\u001d\u1409\u0017\u001e\u1409\u0018\u001f\u1409\u0006", new Object[] { "d", "c", "b", "e", "f", "h", "i", "k", ajut.class, alrg.class, "m", "n", "o", "p", "g", "l", "q", "u", "v", "t", "r", "y", "z", "w", "x", "j" });
            }
            case 1: {
                if (o == null) {
                    a2 = 0;
                }
                this.A = a2;
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
