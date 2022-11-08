import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiva extends agzi implements ahax
{
    public static final aiva a;
    private static volatile ahbe w;
    private byte A;
    public int b;
    public ajsq c;
    public aorm d;
    public akbf e;
    public String f;
    public agzy g;
    public aibc h;
    public aibc i;
    public ahfw j;
    public agzy k;
    public agzy l;
    public ajsq m;
    public ajsq n;
    public agyc o;
    public agzy p;
    public ajsq q;
    public ajsq r;
    public aioe s;
    public aioe t;
    public aioe u;
    public ajsq v;
    private aioe x;
    private aiab y;
    private aibc z;
    
    static {
        agzi.registerDefaultInstance(aiva.class, a = new aiva());
    }
    
    private aiva() {
        this.A = 2;
        this.f = "";
        this.g = agzi.emptyProtobufList();
        this.k = agzi.emptyProtobufList();
        this.l = agzi.emptyProtobufList();
        emptyProtobufList();
        this.o = agyc.b;
        this.p = agzi.emptyProtobufList();
        emptyProtobufList();
    }
    
    public final void a() {
        final agzy g = this.g;
        if (!g.c()) {
            this.g = agzi.mutableCopy(g);
        }
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
                final ahbe w;
                if ((w = aiva.w) == null) {
                    synchronized (aiva.class) {
                        if (aiva.w == null) {
                            aiva.w = (ahbe)new agzb((agzi)aiva.a);
                        }
                    }
                }
                return w;
            }
            case 5: {
                return aiva.a;
            }
            case 4: {
                return new agza((char[][][])null, (char[][])null);
            }
            case 3: {
                return new aiva();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiva.a, "\u0001\u0017\u0000\u0001\u0001$\u0017\u0000\u0004\u0015\u0001\u1409\u0000\u0002\u1409\u001d\u0003\u1409\u0018\u0004\u1409\u0019\u0005\u1409\u001a\u0006\u1409\u000b\u0007\u100a\u0013\b\u041b\t\u1409\u001b\n\u1409\u001c\f\u1409\u0006\r\u1409\u0007\u000e\u1409\u0001\u0010\u1409\u0004\u0012\u1008\u0005\u0017\u041b\u0018\u041b\u0019\u041b\u001c\u1409\u000e\u001e\u1409\u000f\u001f\u1409\u0010#\u1409\u0016$\u1409\u0017", new Object[] { "b", "c", "v", "q", "r", "s", "j", "o", "g", ajsq.class, "t", "u", "h", "i", "d", "e", "f", "p", aioe.class, "k", aioe.class, "l", aioe.class, "m", "x", "n", "y", "z" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.A = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
