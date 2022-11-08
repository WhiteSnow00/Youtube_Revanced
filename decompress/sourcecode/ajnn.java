import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnn extends agzi implements ahax
{
    public static final ajnn a;
    private static volatile ahbe p;
    public int b;
    public ajsq c;
    public anss d;
    public ajsq e;
    public ajno f;
    public ajsq g;
    public anss h;
    public agzy i;
    public boolean j;
    public anss k;
    public aorm l;
    public aioe m;
    public anss n;
    public anss o;
    private anss q;
    private anss r;
    private anss s;
    private aioe t;
    private aioe u;
    private ahfw v;
    private byte w;
    
    static {
        agzi.registerDefaultInstance((Class)ajnn.class, (agzi)(a = new ajnn()));
    }
    
    private ajnn() {
        this.w = 2;
        this.i = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe p3;
                if ((p3 = ajnn.p) == null) {
                    synchronized (ajnn.class) {
                        if (ajnn.p == null) {
                            ajnn.p = (ahbe)new agzb((agzi)ajnn.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajnn.a;
            }
            case 4: {
                return new agza((byte[][][])null, (int[][])null);
            }
            case 3: {
                return new ajnn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnn.a, "\u0001\u0013\u0000\u0001\u0001\u0019\u0013\u0000\u0001\u0012\u0001\u1409\u0001\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0002\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\n\n\u1409\u0010\u000b\u1409\u0015\r\u1409\u000b\u000e\u1007\b\u000f\u1409\u000e\u0010\u1409\u0011\u0011\u1409\u0012\u0013\u1409\u000f\u0015\u1409\r\u0016\u1409\t\u0017\u1409\u0014\u0019\u041b", new Object[] { "b", "c", "e", "f", "d", "g", "h", "q", "s", "v", "l", "j", "r", "t", "u", "n", "m", "k", "o", "i", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.w = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
