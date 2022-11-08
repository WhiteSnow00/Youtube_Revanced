import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqr extends agzi implements ahax
{
    private static volatile ahbe M;
    public static final ahqr a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    public agzy K;
    public boolean L;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public boolean o;
    public boolean p;
    public agzy q;
    public boolean r;
    public boolean s;
    public ahrb t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ajov y;
    public aoix z;
    
    static {
        agzi.registerDefaultInstance(ahqr.class, a = new ahqr());
    }
    
    private ahqr() {
        this.q = agzi.emptyProtobufList();
        emptyIntList();
        emptyIntList();
        this.G = "";
        this.K = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = ahqr.M) == null) {
                    synchronized (ahqr.class) {
                        if (ahqr.M == null) {
                            ahqr.M = (ahbe)new agzb((agzi)ahqr.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ahqr.a;
            }
            case 4: {
                return new agza((agzi)ahqr.a);
            }
            case 3: {
                return new ahqr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqr.a, "\u0001#\u0000\u0002\u0004?#\u0000\u0002\u0000\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u1007\u0005\u0007\u1007\u0007\b\u1007\b\t\u1007\t\u000b\u1004\u000b\f\u1004\f\r\u1007\r\u000e\u1004\u000e\u0013\u1001\u0013\u0014\u1007\u0014\u0015\u1007\u0015\u0016\u001a\u0018\u1007\u0016\u0019\u1007\u0017\u001a\u1009\u0018\u001b\u1007\u0019\u001c\u1007\u001a\u001d\u1007\u001b \u1007 !\u1009!\"\u1009\",\u1007*-\u1007+.\u1007,0\u1007.4\u100415\u100426\u100837\u100748\u10075;\u10077=\u001a?\u1007:", new Object[] { "b", "c", "d", ajoa.i, "e", ahng.o, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" });
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
