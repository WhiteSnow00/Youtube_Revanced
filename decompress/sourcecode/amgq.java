import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgq extends agzi implements ahax
{
    public static final amgq a;
    private static volatile ahbe t;
    private byte A;
    public int b;
    public ajsq c;
    public ajsq d;
    public amgp e;
    public amgp f;
    public anss g;
    public anss h;
    public amgo i;
    public anss j;
    public anss k;
    public aorm l;
    public ajsq m;
    public ajsq n;
    public ajsq o;
    public akbf p;
    public boolean q;
    public boolean r;
    public anss s;
    private amgr u;
    private amgn v;
    private anss w;
    private anss x;
    private amiy y;
    private ajsq z;
    
    static {
        agzi.registerDefaultInstance((Class)amgq.class, (agzi)(a = new amgq()));
    }
    
    private amgq() {
        this.A = 2;
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
                final ahbe t;
                if ((t = amgq.t) == null) {
                    synchronized (amgq.class) {
                        if (amgq.t == null) {
                            amgq.t = (ahbe)new agzb((agzi)amgq.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amgq.a;
            }
            case 4: {
                return new agza((agzi)amgq.a);
            }
            case 3: {
                return new amgq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgq.a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0015\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\b\u0006\u1409\u0005\u0007\u1409\t\b\u1409\n\t\u1409\r\n\u1409\u0006\u000b\u1409\u0007\f\u1409\f\r\u1409\u000e\u000e\u1409\u000f\u0010\u1409\u000b\u0011\u1409\u0001\u0012\u1409\u0010\u0013\u1409\u0011\u0015\u1007\u0013\u0016\u1409\u0014\u0017\u1409\u0015\u0019\u1007\u0017\u001a\u1409\u0018", new Object[] { "b", "c", "e", "f", "u", "i", "v", "j", "w", "l", "g", "h", "k", "m", "n", "x", "d", "o", "p", "q", "y", "z", "r", "s" });
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
