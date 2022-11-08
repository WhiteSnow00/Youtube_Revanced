import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhf extends agzi implements ahax
{
    public static final amhf a;
    private static volatile ahbe t;
    public int b;
    public aorm c;
    public amhe d;
    public anss e;
    public amhd f;
    public amha g;
    public anss h;
    public anss i;
    public amgz j;
    public anss k;
    public anss l;
    public anss m;
    public anss n;
    public anss o;
    public boolean p;
    public anss q;
    public anss r;
    public anss s;
    private amhc u;
    private amhc v;
    private amgy w;
    private amhb x;
    private byte y;
    
    static {
        agzi.registerDefaultInstance((Class)amhf.class, (agzi)(a = new amhf()));
    }
    
    private amhf() {
        this.y = 2;
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
                if ((t = amhf.t) == null) {
                    synchronized (amhf.class) {
                        if (amhf.t == null) {
                            amhf.t = (ahbe)new agzb((agzi)amhf.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amhf.a;
            }
            case 4: {
                return new agza((boolean[])null, (short[][][])null);
            }
            case 3: {
                return new amhf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhf.a, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0014\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\u000b\n\u1409\f\f\u1409\u000e\r\u1409\u000f\u000e\u1409\r\u000f\u1409\u0010\u0010\u1409\u0002\u0011\u1409\t\u0012\u1409\n\u0013\u1007\u0011\u0014\u1409\u0012\u0015\u1409\u0013\u0016\u1409\u0014", new Object[] { "b", "c", "d", "f", "u", "v", "g", "w", "x", "j", "k", "m", "n", "l", "o", "e", "h", "i", "p", "q", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.y = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
