import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsq extends agzi implements ahax
{
    private static volatile ahbe V;
    public static final alsq a;
    public agzy A;
    public boolean B;
    public boolean C;
    public agzy D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public alsr R;
    public boolean S;
    public boolean T;
    public boolean U;
    private int W;
    private int X;
    private int Y;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public boolean z;
    
    static {
        agzi.registerDefaultInstance(alsq.class, a = new alsq());
    }
    
    private alsq() {
        emptyIntList();
        this.A = agzi.emptyProtobufList();
        this.D = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe v;
                if ((v = alsq.V) == null) {
                    synchronized (alsq.class) {
                        if (alsq.V == null) {
                            alsq.V = (ahbe)new agzb((agzi)alsq.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return alsq.a;
            }
            case 4: {
                return new agza((agzi)alsq.a);
            }
            case 3: {
                return new alsq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsq.a, "\u0001.\u0000\u0003\u0006b.\u0000\u0002\u0000\u0006\u1007\u0005\u0007\u1007\u0006\b\u1004\u0007\t\u1004\b\u0011\u100c\u0010\u0012\u1004\t\u0013\u1007\u0011\u0014\u1007\u0013\u0019\u1007\u0018\u001a\u1007\u0019\u001d\u1007\u001c\u001e\u1007\u001d\u001f\u1007\u001e \u1007 !\u1004!\"\u1004\"#\u1004#$\u1004$%\u1004%&\u1007&'\u10041(\u10012,\u100751\u001a7\u1007;8\u1004\u001f?\u1007@A\u001aC\u1007EE\u10040N\u1004IQ\u1007JR\u1007KS\u1007MU\u1004OV\u1004PW\u1007LX\u1007QY\u1007RZ\u1007S[\u1007T\\\u1007U^\u1009W_\u1007X`\u1007Yb\u1007[", new Object[] { "W", "X", "Y", "b", "c", "d", "e", "g", alsb.d, "f", "h", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z", "A", "B", "o", "C", "D", "E", "w", "F", "G", "H", "J", "K", "L", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U" });
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
