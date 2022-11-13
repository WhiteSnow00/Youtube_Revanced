import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alel extends ahbh implements ahcw
{
    private static volatile ahdd I;
    public static final alel a;
    public aldw A;
    public boolean B;
    public amel C;
    public anvq D;
    public ahab E;
    public ajbs F;
    public aicn G;
    public ahan H;
    private akxf J;
    private byte K;
    public int b;
    public int c;
    public aklg d;
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
    public ahbp p;
    public boolean q;
    public int r;
    public boolean s;
    public aleg t;
    public String u;
    public aleh v;
    public long w;
    public String x;
    public String y;
    public String z;
    
    static {
        ahbh.registerDefaultInstance((Class)alel.class, (ahbh)(a = new alel()));
    }
    
    private alel() {
        this.K = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.k = "";
        this.o = 1;
        this.p = emptyIntList();
        this.u = "";
        this.x = "";
        this.y = "";
        this.z = "";
        this.E = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = alel.I) == null) {
                    synchronized (alel.class) {
                        if (alel.I == null) {
                            alel.I = (ahdd)new ahba((ahbh)alel.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alel.a;
            }
            case 4: {
                return new ahaz((short[])null);
            }
            case 3: {
                return new alel();
            }
            case 2: {
                return newMessageInfo((MessageLite)alel.a, "\u0001 \u0000\u0002\u00015 \u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1008\u0002\u0006\u1008\u0004\u0007\u100b\u0006\b\u1008\u0005\t\u1007\b\n\u1007\f\u000b\u1409\r\u000e\u100c\u0010\u000f\u0016\u0010\u1008\t\u0018\u1007\u000b\u0019\u1007\n\u001a\u1007\u0018\u001c\u100c\u001a\u001e\u1007\u001b$\u1009\u001f%\u1008 '\u1009#)\u1003$+\u1008&,\u1008'-\u1008(.\u1009)/\u1007*0\u1009+1\u1009,2\u100a-3\u1009.4\u1009/5\u10090", new Object[] { "b", "c", "d", "e", "f", "g", "i", "h", "j", "n", "J", "o", alek.a(), "p", "k", "m", "l", "q", "r", ahuc.l, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H" });
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
