import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloj extends ahcz implements aheo
{
    private static volatile ahev U;
    public static final aloj a;
    public boolean A;
    public String B;
    public boolean C;
    public String D;
    public String E;
    public int F;
    public String G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public alol L;
    public aloo M;
    public alov N;
    public int O;
    public aloq P;
    public ahdp Q;
    public alow R;
    public alop S;
    public int T;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public apry h;
    public String i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public boolean u;
    public int v;
    public String w;
    public String x;
    public String y;
    public int z;
    
    static {
        ahcz.registerDefaultInstance(aloj.class, a = new aloj());
    }
    
    private aloj() {
        this.f = "";
        this.g = "";
        this.i = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.t = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.B = "";
        this.D = "";
        this.E = "";
        this.G = "";
        emptyProtobufList();
        this.Q = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev u;
                if ((u = aloj.U) == null) {
                    synchronized (aloj.class) {
                        if (aloj.U == null) {
                            aloj.U = (ahev)new ahcs((ahcz)aloj.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return aloj.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (short[])null);
            }
            case 3: {
                return new aloj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aloj.a, "\u0001*\u0000\u0003\u0001e*\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0004\u0004\u1008\u0002\u0006\u1007\n\b\u1008\f\t\u1007\u0010\f\u1008\u0013\u000e\u1007\u0017\u000f\u1004\u0018\u0010\u1007\u0011\u0011\u1007\u0012\u0013\u1008\u001a\u0014\u1008\u001b\u0015\u100c\u001d\u0016\u10098\u0018\u1009:\u0019\u1007\u001e\u001a\u100c\b\u001b\u100c\t\u001c\u1008\r\u001f\u1008# \u1007$!\u1008%\"\u1008&+\u1004),\u1008*-\u1007+2\u1009?5\u100cD6\u1009E7\u1007\u0006D\u001bG\u100c/L\u1008\u000fN\u1008\u001cV\u1009NX\u1009\u0003Z\u10024]\u10025_\u1009Me\u100cP", new Object[] { "b", "c", "d", "e", alox.a(), "f", "i", "g", "m", "n", "q", "t", "u", "v", "r", "s", "w", "x", "z", aloy.a(), "L", "M", "A", "k", ainu.a(), "l", ajfx.a(), "o", "B", "C", "D", "E", "F", "G", "H", "N", "O", apeu.a(), "P", "j", "Q", aloi.class, "I", alfq.r, "p", "y", "S", "h", "J", "K", "R", "T", alpf.b });
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
