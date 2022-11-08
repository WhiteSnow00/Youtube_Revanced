import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpg extends agzi implements ahax
{
    public static final alpg a;
    private static volatile ahbe p;
    public int b;
    public String c;
    public aioe d;
    public aorm e;
    public ajsq f;
    public int g;
    public int h;
    public int i;
    public ajsq j;
    public String k;
    public ajsq l;
    public aorm m;
    public int n;
    public int o;
    private ajsq q;
    private ajsq r;
    private ajsq s;
    private ahfw t;
    private anss u;
    private byte v;
    
    static {
        agzi.registerDefaultInstance(alpg.class, a = new alpg());
    }
    
    private alpg() {
        this.v = 2;
        this.c = "";
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        final agyc b = agyc.b;
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
                if ((p3 = alpg.p) == null) {
                    synchronized (alpg.class) {
                        if (alpg.p == null) {
                            alpg.p = (ahbe)new agzb((agzi)alpg.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return alpg.a;
            }
            case 4: {
                return new agza((agzi)alpg.a);
            }
            case 3: {
                return new alpg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpg.a, "\u0001\u0012\u0000\u0001\u0001\u001a\u0012\u0000\u0000\u000b\u0001\u1008\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u1409\u0005\b\u1008\f\t\u1409\r\u000b\u1409\u0010\r\u1409\u000e\u000e\u1409\u0013\u000f\u1409\u0014\u0011\u100b\t\u0012\u1409\n\u0013\u1004\u0011\u0014\u1004\u0012\u0016\u100b\u0007\u0017\u100b\u0006\u0018\u1409\u0015\u001a\u1409\u0017", new Object[] { "b", "c", "d", "e", "f", "k", "q", "m", "l", "r", "s", "i", "j", "n", "o", "h", "g", "t", "u" });
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
