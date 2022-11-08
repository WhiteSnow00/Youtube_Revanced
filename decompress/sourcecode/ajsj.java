import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajsj extends agzd implements agze
{
    private static volatile ahbe I;
    public static final agzr a;
    public static final ajsj b;
    public double A;
    public int B;
    public aico C;
    public int D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    private int J;
    private byte K;
    public int c;
    public int d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ajsk m;
    public ajsk n;
    public long o;
    public long p;
    public String q;
    public agzq r;
    public String s;
    public int t;
    public int u;
    public int v;
    public ahum w;
    public ajsi x;
    public ajsl y;
    public double z;
    
    static {
        a = (agzr)new prz(19);
        agzi.registerDefaultInstance((Class)ajsj.class, (agzi)(b = new ajsj()));
    }
    
    private ajsj() {
        this.K = 2;
        this.e = "";
        this.f = "";
        this.q = "";
        this.r = emptyIntList();
        this.s = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ajsj.I) == null) {
                    synchronized (ajsj.class) {
                        if (ajsj.I == null) {
                            ajsj.I = (ahbe)new agzb((agzi)ajsj.b);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajsj.b;
            }
            case 4: {
                return new agzc(ajsj.b);
            }
            case 3: {
                return new ajsj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajsj.b, "\u0001\u001e\u0000\u0002\u00011\u001e\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0005\u1008\u0002\u0006\u1004\u0003\u0007\u1004\u0005\b\u1004\u0006\t\u1009\b\n\u1009\t\u000b\u1002\n\f\u1002\u000b\u0017\u1008\r\u0018\u001e\u0019\u1004\u0007\u001a\u1008\u000e\u001b\u100c\u000f\u001c\u1009\u0012\u001f\u1004\u0004 \u100c\u0010!\u1009\u0013\"\u1009\u0014#\u1000\u0015%\u100c\u0011&\u1000\u0017)\u100c\u0019*\u1009\u001a+\u100c\u001b-\u1003\u001d.\u100b\u001e/\u1001\u001f1\u1007!", new Object[] { "c", "J", "d", "e", "f", "g", "i", "j", "m", "n", "o", "p", "q", "r", allr.a(), "k", "s", "t", ajrv.i, "w", "h", "u", ajrv.j, "x", "y", "z", "v", aocr.u, "A", "B", ajrv.f, "C", "D", ahse.h, "E", "F", "G", "H" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.K = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.K;
            }
        }
    }
}
