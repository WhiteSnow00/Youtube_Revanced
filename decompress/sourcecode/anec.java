import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anec extends agzi implements ahax
{
    public static final anec a;
    private static volatile ahbe t;
    private ajsq A;
    private ahfw B;
    private byte C;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public andz g;
    public anea h;
    public anef i;
    public aorm j;
    public agzy k;
    public int l;
    public int m;
    public boolean n;
    public agzy o;
    public boolean p;
    public String q;
    public anss r;
    public agyc s;
    private ajsq u;
    private ajsq v;
    private aioe w;
    private andz x;
    private ahyg y;
    private ajsq z;
    
    static {
        agzi.registerDefaultInstance(anec.class, a = new anec());
    }
    
    private anec() {
        this.C = 2;
        this.k = agzi.emptyProtobufList();
        this.m = -1;
        this.o = agzi.emptyProtobufList();
        this.q = "";
        this.s = agyc.b;
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
                if ((t = anec.t) == null) {
                    synchronized (anec.class) {
                        if (anec.t == null) {
                            anec.t = (ahbe)new agzb((agzi)anec.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return anec.a;
            }
            case 4: {
                return new agza((agzi)anec.a);
            }
            case 3: {
                return new anec();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anec.a, "\u0001\u0019\u0000\u0001\u0001\u001d\u0019\u0000\u0002\u0013\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\b\u0007\u1409\n\b\u1004\f\t\u1409\u0005\n\u1409\t\u000b\u1409\u0018\f\u100a\u0019\r\u1409\u000b\u000f\u1409\u0007\u0010\u041b\u0011\u1409\u000f\u0012\u1007\u0010\u0013\u041b\u0014\u1007\u0011\u0015\u1008\u0014\u0016\u1409\u0003\u0017\u1409\u0015\u001a\u1409\u0016\u001c\u1004\r\u001d\u1409\u0017", new Object[] { "b", "c", "d", "e", "u", "v", "w", "j", "l", "g", "i", "B", "s", "x", "h", "k", aora.class, "y", "n", "o", anss.class, "p", "q", "f", "z", "A", "m", "r" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.C = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.C;
            }
        }
    }
}
