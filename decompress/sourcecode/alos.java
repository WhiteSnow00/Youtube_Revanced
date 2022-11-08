import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alos extends agzi implements ahax
{
    public static final alos a;
    private static volatile ahbe t;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public alqg f;
    public agzy g;
    public String h;
    public long i;
    public long j;
    public aloo k;
    public aloq l;
    public alor m;
    public agzy n;
    public anss o;
    public anss p;
    public agyc q;
    public boolean r;
    public ajsq s;
    private ajsq u;
    private anss v;
    private alov w;
    private ahfw x;
    private aioe y;
    private byte z;
    
    static {
        agzi.registerDefaultInstance(alos.class, a = new alos());
    }
    
    private alos() {
        this.c = 0;
        this.z = 2;
        this.g = agzi.emptyProtobufList();
        this.h = "";
        agzi.emptyProtobufList();
        this.n = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe t;
                if ((t = alos.t) == null) {
                    synchronized (alos.class) {
                        if (alos.t == null) {
                            alos.t = (ahbe)new agzb((agzi)alos.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return alos.a;
            }
            case 4: {
                return new agza((agzi)alos.a);
            }
            case 3: {
                return new alos();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alos.a, "\u0001\u0016\u0001\u0001\u0001\u001b\u0016\u0000\u0002\u000f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u103b\u0000\u0005\u1002\u0007\u0006\u1409\n\u0007\u1409\u000b\b\u1409\f\t\u1002\b\n\u1008\u0006\u000b\u041b\u0010\u1409\u000f\u0012\u1409\u0011\u0013\u100a\u0012\u0014\u1007\u0013\u0015\u143c\u0000\u0016\u1009\u0003\u0017\u1409\u0014\u0018\u1409\u0010\u0019\u1409\u000e\u001a\u1409\u0002\u001b\u1409\u0015", new Object[] { "d", "c", "b", "e", "u", "g", alou.class, "i", "k", "l", "m", "j", "h", "n", aloy.class, "o", "x", "q", "r", alon.class, "f", "s", "p", "w", "v", "y" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.z = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
