import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amrz extends agzi implements ahax
{
    private static volatile ahbe G;
    public static final amrz a;
    public boolean A;
    public boolean B;
    public long C;
    public boolean D;
    public boolean E;
    public boolean F;
    private int H;
    private int I;
    private int J;
    public int b;
    public amtf c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public long y;
    public boolean z;
    
    static {
        agzi.registerDefaultInstance(amrz.class, a = new amrz());
    }
    
    private amrz() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = amrz.G) == null) {
                    synchronized (amrz.class) {
                        if (amrz.G == null) {
                            amrz.G = (ahbe)new agzb((agzi)amrz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amrz.a;
            }
            case 4: {
                return new agza((agzi)amrz.a);
            }
            case 3: {
                return new amrz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amrz.a, "\u0001\u001e\u0000\u0004\u0004\ue3ce\u3e24\u001e\u0000\u0000\u0000\u0004\u1004\u0006\u0006\u1007\b\r\u1007\u000f\u000e\u1007\u0010\u0013\u1007\u0015\u0014\u1007\u0016\u0015\u1004\u0017\u0016\u1007\u0018\u0017\u1007\u001a\u001a\u1007\u001d\u001b\u1004\u0019\u001d\u1007\u001f\u001e\u1007 &\u1007'/\u10070;\u1007;B\u1007BJ\u1007HN\u1007KO\u1007LP\u1007MU\u1002QV\u1007RZ\u1007Ve\u1007`f\u1002ag\u1007bk\u1007do\u1007h\ue3ce\u3e24\u1009\u0000", new Object[] { "b", "H", "I", "J", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "l", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "c" });
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
