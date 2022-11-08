import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahld extends agzi implements ahax
{
    public static final ahld a;
    private static volatile ahbe u;
    public agzy b;
    public agzy c;
    public agzy d;
    public agzy e;
    public agzy f;
    public agzy g;
    public agzy h;
    public agzy i;
    public agzy j;
    public ahkr k;
    public agzy l;
    public agzy m;
    public agzy n;
    public agzy o;
    public agzy p;
    public agzy q;
    public agzy r;
    public agzy s;
    public agzy t;
    private int v;
    private byte w;
    
    static {
        agzi.registerDefaultInstance((Class)ahld.class, (agzi)(a = new ahld()));
    }
    
    private ahld() {
        this.w = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        emptyProtobufList();
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
        this.t = emptyProtobufList();
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
                final ahbe u;
                if ((u = ahld.u) == null) {
                    synchronized (ahld.class) {
                        if (ahld.u == null) {
                            ahld.u = (ahbe)new agzb((agzi)ahld.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return ahld.a;
            }
            case 4: {
                return new agza((agzi)ahld.a);
            }
            case 3: {
                return new ahld();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahld.a, "\u0001\u0013\u0000\u0001\u0001\u0017\u0013\u0000\u0012\u0013\u0001\u041b\u0002\u041b\u0005\u041b\u0007\u041b\b\u041b\t\u041b\n\u041b\u000b\u041b\f\u041b\r\u041b\u000e\u041b\u000f\u041b\u0010\u041b\u0012\u041b\u0013\u041b\u0014\u041b\u0015\u041b\u0016\u041b\u0017\u1409\u0000", new Object[] { "v", "b", aioe.class, "c", aioe.class, "d", aioe.class, "e", aioe.class, "f", aioe.class, "g", aioe.class, "h", ahmb.class, "i", aioe.class, "j", aioe.class, "l", aioe.class, "m", aioe.class, "n", aioe.class, "o", aioe.class, "p", aioe.class, "q", aioe.class, "r", aioe.class, "s", aioe.class, "t", aioe.class, "k" });
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
