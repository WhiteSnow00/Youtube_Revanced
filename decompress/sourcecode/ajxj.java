import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxj extends agzd implements agze
{
    public static final ajxj a;
    private static volatile ahbe r;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public aioe i;
    public agyc j;
    public agzy k;
    public amer m;
    public alvq n;
    public ahkq o;
    public ajxi p;
    public String q;
    private ajsq s;
    private aioe t;
    private ahfw u;
    private byte v;
    
    static {
        agzi.registerDefaultInstance((Class)ajxj.class, (agzi)(a = new ajxj()));
    }
    
    private ajxj() {
        this.v = 2;
        this.j = agyc.b;
        this.k = agzi.emptyProtobufList();
        this.q = "";
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
                final ahbe r;
                if ((r = ajxj.r) == null) {
                    synchronized (ajxj.class) {
                        if (ajxj.r == null) {
                            ajxj.r = (ahbe)new agzb((agzi)ajxj.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return ajxj.a;
            }
            case 4: {
                return new agzc(ajxj.a);
            }
            case 3: {
                return new ajxj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxj.a, "\u0001\u0011\u0000\u0001\u0002\u0016\u0011\u0000\u0001\r\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u100a\n\f\u1409\u000b\r\u001a\u000e\u1409\f\u0011\u1409\u0012\u0012\u1409\u0013\u0014\u1009\r\u0015\u1409\u0011\u0016\u1008\u0014", new Object[] { "b", "c", "d", "s", "e", "f", "g", "h", "i", "j", "t", "k", "m", "u", "p", "n", "o", "q" });
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
