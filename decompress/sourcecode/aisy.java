import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisy extends agzi implements ahax
{
    public static final aisy a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public akbf g;
    public anss h;
    public aorm i;
    public ajsq j;
    public ajsq k;
    public String l;
    public aisx m;
    public agyc n;
    public boolean o;
    private ajsq q;
    private aioe r;
    private aioe s;
    private ahfw t;
    private byte u;
    
    static {
        agzi.registerDefaultInstance(aisy.class, a = new aisy());
    }
    
    private aisy() {
        this.c = 0;
        this.e = 0;
        this.u = 2;
        this.l = "";
        this.n = agyc.b;
        this.o = true;
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
                final ahbe p3;
                if ((p3 = aisy.p) == null) {
                    synchronized (aisy.class) {
                        if (aisy.p == null) {
                            aisy.p = (ahbe)new agzb((agzi)aisy.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aisy.a;
            }
            case 4: {
                return new agza((agzi)aisy.a);
            }
            case 3: {
                return new aisy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aisy.a, "\u0001\u0011\u0002\u0001\u0001\u0018\u0011\u0000\u0000\u000e\u0001\u1409\u0001\u0002\u1409\u0003\u0003\u1409\u0005\u0004\u143c\u0001\u0005\u1409\u0014\u0006\u100a\u0015\u0007\u143c\u0000\b\u143c\u0000\t\u143c\u0001\u000b\u1409\u0012\f\u1008\u0011\r\u1409\u0006\u0011\u1007\u0017\u0012\u1409\u0002\u0013\u1409\u000f\u0014\u1409\u0010\u0018\u1409\u0007", new Object[] { "d", "c", "f", "e", "b", "g", "i", "j", aioe.class, "t", "n", akbf.class, ajsq.class, aioe.class, "m", "l", "k", "o", "h", "r", "s", "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.u = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
