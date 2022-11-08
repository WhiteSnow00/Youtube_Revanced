import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtm extends agzi implements ahax
{
    private static volatile ahbe C;
    public static final amtm a;
    public boolean A;
    public boolean B;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public String j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public int r;
    public String s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public agyc z;
    
    static {
        agzi.registerDefaultInstance(amtm.class, a = new amtm());
    }
    
    private amtm() {
        this.d = "";
        this.e = "";
        this.f = "";
        this.j = "";
        this.s = "";
        emptyProtobufList();
        this.z = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amtm.C) == null) {
                    synchronized (amtm.class) {
                        if (amtm.C == null) {
                            amtm.C = (ahbe)new agzb((agzi)amtm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amtm.a;
            }
            case 4: {
                return new agza((agzi)amtm.a);
            }
            case 3: {
                return new amtm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtm.a, "\u0001\u0019\u0000\u0002\u0001*\u0019\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0004\u0003\u100c\u0005\u0004\u1002\b\u0005\u1002\t\u0007\u100c\u000e\b\u1007\u000f\t\u100c\u0010\n\u1008\u0013\u000b\u100c\u0014\r\u100b\u0017\u000f\u1007\u0019\u0014\u1008\u0001\u0015\u1002\n\u0016\u1002\u000b\u0017\u1002\f\u001d\u100c\u0015\u001e\u1008\u0002!\u100c!$\u1007$%\u1008\u0007&\u100c\u0003'\u100a%(\u1007&*\u1007'", new Object[] { "b", "c", "d", "h", amsc.t, "i", amtj.a(), "k", "l", "p", ajbv.a(), "q", "r", amsc.d, "s", "t", amuv.a(), "v", "w", "e", "m", "n", "o", "u", amom.r, "f", "x", amsc.r, "y", "j", "g", amsc.u, "z", "A", "B" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
