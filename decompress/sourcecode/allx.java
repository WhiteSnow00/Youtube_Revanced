import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class allx extends agzd implements agze
{
    public static final allx a;
    private static volatile ahbe s;
    public int b;
    public alme c;
    public int d;
    public int e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public int i;
    public ajsq j;
    public ajsq k;
    public ajsq m;
    public agyc n;
    public boolean o;
    public agzy p;
    public String q;
    public aioe r;
    private ajsq t;
    private ajsq u;
    private ahfw v;
    private aioe w;
    private aioe x;
    private byte y;
    
    static {
        agzi.registerDefaultInstance((Class)allx.class, (agzi)(a = new allx()));
    }
    
    private allx() {
        this.y = 2;
        this.n = agyc.b;
        this.p = emptyProtobufList();
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
                final ahbe s;
                if ((s = allx.s) == null) {
                    synchronized (allx.class) {
                        if (allx.s == null) {
                            allx.s = (ahbe)new agzb((agzi)allx.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return allx.a;
            }
            case 4: {
                return new agzc(allx.a);
            }
            case 3: {
                return new allx();
            }
            case 2: {
                return newMessageInfo((MessageLite)allx.a, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0001\r\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1004\u0007\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u100a\f\r\u1007\r\u000e\u1409\u000e\u000f\u041b\u0010\u1409\u000f\u0011\u1409\u0010\u0012\u1008\u0011\u0013\u1409\u0006\u0014\u1409\u000b\u0015\u1409\u0012", new Object[] { "b", "c", "d", almd.a(), "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "v", "p", aioe.class, "w", "x", "q", "t", "u", "r" });
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
