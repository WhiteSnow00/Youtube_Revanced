import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpf extends agzi implements ahax
{
    public static final alpf a;
    private static volatile ahbe s;
    private byte A;
    public int b;
    public int c;
    public Object d;
    public String e;
    public long f;
    public String g;
    public ajsq h;
    public aorm i;
    public aizn j;
    public ajsq k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public aioe q;
    public anss r;
    private ajsq t;
    private ajsq u;
    private ajsq v;
    private anss w;
    private anss x;
    private ahfw y;
    private alpe z;
    
    static {
        agzi.registerDefaultInstance(alpf.class, a = new alpf());
    }
    
    private alpf() {
        this.c = 0;
        this.A = 2;
        this.e = "";
        this.g = "";
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe s;
                if ((s = alpf.s) == null) {
                    synchronized (alpf.class) {
                        if (alpf.s == null) {
                            alpf.s = (ahbe)new agzb((agzi)alpf.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return alpf.a;
            }
            case 4: {
                return new agza((agzi)alpf.a);
            }
            case 3: {
                return new alpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpf.a, "\u0001\u0018\u0001\u0001\u0001\u001f\u0018\u0000\u0000\u000f\u0001\u1008\u0000\u0002\u1003\u0001\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\b\u0006\u103a\u0000\u0007\u143c\u0000\b\u143c\u0000\t\u100b\n\n\u100b\u000b\u000b\u100b\f\f\u100b\r\r\u1008\u0003\u000e\u100b\t\u000f\u1409\u0015\u0012\u1409\u0013\u0013\u1409\u0014\u0016\u1409\u0002\u0017\u1409\u0019\u0018\u1409\u001a\u001c\u1409\u001c\u001d\u1409\u0017\u001e\u1409\u0018\u001f\u1409\u0006", new Object[] { "d", "c", "b", "e", "f", "h", "i", "k", ajsq.class, alpd.class, "m", "n", "o", "p", "g", "l", "q", "u", "v", "t", "r", "y", "z", "w", "x", "j" });
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
