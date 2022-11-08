import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxb extends agzi implements ahax
{
    private static volatile ahbe A;
    public static final atxb a;
    private byte B;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public atxm l;
    public int m;
    public atwz n;
    public int o;
    public atwp p;
    public long q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public agzt w;
    public String x;
    public atxf y;
    public atwx z;
    
    static {
        agzi.registerDefaultInstance(atxb.class, a = new atxb());
    }
    
    private atxb() {
        this.B = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        emptyProtobufList();
        this.v = "";
        this.w = agzi.emptyLongList();
        this.x = "";
        emptyProtobufList();
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
                final ahbe a2;
                if ((a2 = atxb.A) == null) {
                    synchronized (atxb.class) {
                        if (atxb.A == null) {
                            atxb.A = (ahbe)new agzb((agzi)atxb.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return atxb.a;
            }
            case 4: {
                return new agza((boolean[][])null, (byte[])null);
            }
            case 3: {
                return new atxb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxb.a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u100b\u0006\u0007\u100b\u0007\b\u100c\b\n\u1009\t\u000b\u1009\u000b\f\u1409\r\r\u1002\u000e\u000e\u100c\u000f\u000f\u100c\u0010\u0010\u1004\u0012\u0011\u1008\u0013\u0013\u1004\u0011\u0014\u1008\u0015\u0015(\u0016\u1009\u0016\u0018\u100c\n\u0019\u1008\u0002\u001a\u1009\u0017\u001b\u100c\f", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "k", arbt.l, "l", "n", "p", "q", "r", atxe.a(), "s", arbt.k, "u", "v", "t", "x", "w", "y", "m", atxa.a(), "e", "z", "o", atxd.a() });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.B = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
