import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appb extends agzi implements ahax
{
    public static final appb a;
    private static volatile ahbe o;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public aioe h;
    public agzy i;
    public agzy j;
    public int k;
    public amer l;
    public String m;
    public agyc n;
    private apdo p;
    private anss q;
    private ahfw r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance((Class)appb.class, (agzi)(a = new appb()));
    }
    
    private appb() {
        this.s = 2;
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.m = "";
        this.n = agyc.b;
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
                final ahbe o3;
                if ((o3 = appb.o) == null) {
                    synchronized (appb.class) {
                        if (appb.o == null) {
                            appb.o = (ahbe)new agzb((agzi)appb.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return appb.a;
            }
            case 4: {
                return new agza((agzi)appb.a);
            }
            case 3: {
                return new appb();
            }
            case 2: {
                return newMessageInfo((MessageLite)appb.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\r\u0007\u100a\u000e\t\u041b\n\u041b\u000b\u100c\b\f\u1409\t\r\u1008\n\u000e\u1409\u0003\u000f\u1409\u0005\u0010\u1409\u000b", new Object[] { "b", "c", "d", "e", "g", "h", "r", "n", "i", aora.class, "j", apoy.class, "k", apms.p, "l", "m", "f", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
