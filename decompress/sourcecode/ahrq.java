import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrq extends agzi implements ahax
{
    public static final ahrq a;
    private static volatile ahbe u;
    public int b;
    public String c;
    public int d;
    public int e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public aorm j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public int s;
    public int t;
    private byte v;
    
    static {
        agzi.registerDefaultInstance(ahrq.class, a = new ahrq());
    }
    
    private ahrq() {
        this.v = 2;
        this.c = "";
        this.d = 99;
        this.k = "";
        this.n = true;
        this.o = true;
        this.r = "";
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
                final ahbe u;
                if ((u = ahrq.u) == null) {
                    synchronized (ahrq.class) {
                        if (ahrq.u == null) {
                            ahrq.u = (ahbe)new agzb((agzi)ahrq.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return ahrq.a;
            }
            case 4: {
                return new agza((agzi)ahrq.a);
            }
            case 3: {
                return new ahrq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrq.a, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0000\u0005\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1008\b\u000b\u1007\n\f\u1007\u000b\r\u1007\f\u000e\u1007\r\u000f\u1008\u000f\u0017\u1004\u0011\u0019\u1007\t\u001a\u100c\u0010\u001b\u1007\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "t", "l", "s", amom.h, "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
