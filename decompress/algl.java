import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algl extends ahcz implements aheo
{
    private static volatile ahev I;
    public static final algl a;
    public alfw A;
    public boolean B;
    public amgn C;
    public anxw D;
    public ahbt E;
    public ajdq F;
    public aieg G;
    public ahcf H;
    private akzf J;
    private byte K;
    public int b;
    public int c;
    public aknh d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public ahdh p;
    public boolean q;
    public int r;
    public boolean s;
    public algg t;
    public String u;
    public algh v;
    public long w;
    public String x;
    public String y;
    public String z;
    
    static {
        ahcz.registerDefaultInstance(algl.class, a = new algl());
    }
    
    private algl() {
        this.K = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.k = "";
        this.o = 1;
        this.p = ahcz.emptyIntList();
        this.u = "";
        this.x = "";
        this.y = "";
        this.z = "";
        this.E = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = algl.I) == null) {
                    synchronized (algl.class) {
                        if (algl.I == null) {
                            algl.I = (ahev)new ahcs((ahcz)algl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return algl.a;
            }
            case 4: {
                return new ahcr((char[][])null, (byte[][])null);
            }
            case 3: {
                return new algl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algl.a, "\u0001 \u0000\u0002\u00015 \u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1008\u0002\u0006\u1008\u0004\u0007\u100b\u0006\b\u1008\u0005\t\u1007\b\n\u1007\f\u000b\u1409\r\u000e\u100c\u0010\u000f\u0016\u0010\u1008\t\u0018\u1007\u000b\u0019\u1007\n\u001a\u1007\u0018\u001c\u100c\u001a\u001e\u1007\u001b$\u1009\u001f%\u1008 '\u1009#)\u1003$+\u1008&,\u1008'-\u1008(.\u1009)/\u1007*0\u1009+1\u1009,2\u100a-3\u1009.4\u1009/5\u10090", new Object[] { "b", "c", "d", "e", "f", "g", "i", "h", "j", "n", "J", "o", algk.a(), "p", "k", "m", "l", "q", "r", ahvv.l, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.K = k;
                return null;
            }
            case 0: {
                return this.K;
            }
        }
    }
}
