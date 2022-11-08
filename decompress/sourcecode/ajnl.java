import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnl extends agzi implements ahax
{
    private static volatile ahbe D;
    public static final agzr a;
    public static final ajnl b;
    public double A;
    public boolean B;
    public int C;
    private byte E;
    public int c;
    public int d;
    public Object e;
    public ajnk f;
    public ajnj g;
    public anss h;
    public ajni i;
    public boolean j;
    public int k;
    public agzq l;
    public int m;
    public int n;
    public int o;
    public agzy p;
    public agzy q;
    public aioe r;
    public aioe s;
    public aioe t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public alts y;
    public anss z;
    
    static {
        a = (agzr)new prz(16);
        agzi.registerDefaultInstance((Class)ajnl.class, (agzi)(b = new ajnl()));
    }
    
    private ajnl() {
        this.d = 0;
        this.E = 2;
        this.l = emptyIntList();
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
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
                final ahbe d;
                if ((d = ajnl.D) == null) {
                    synchronized (ajnl.class) {
                        if (ajnl.D == null) {
                            ajnl.D = (ahbe)new agzb((agzi)ajnl.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnl.b;
            }
            case 4: {
                return new agza((agzi)ajnl.b);
            }
            case 3: {
                return new ajnl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnl.b, "\u0001\u001a\u0001\u0001\u0001\u03e7\u001a\u0000\u0003\n\u0001\u103b\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1009\u0006\u0005\u1004\u0015\u0006\u1007\u0007\n\u1409\u0005\u000b\u041b\f\u041b\r\u100c\n\u000e\u100c\u000b\u000f\u1007\u0012\u0010\u1409\u000f\u0011\u100c\f\u0012\u103c\u0000\u0014\u1007\u0013\u0015,\u0016\u100c\u0014\u0017\u1409\u0011\u0018\u1409\u0010\u0019\u1409\u0017\u001a\u1000\u0018\u001b\u1007\u0019\u001c\u100c\u001a\u001d\u100c\u000e\u03e7\u1409\u0016", new Object[] { "e", "d", "c", "f", "g", "i", "x", "j", "h", "p", aioe.class, "q", aioe.class, "k", ajkr.l, "m", ajkr.i, "u", "r", "n", ajkr.h, ajng.class, "v", "l", ajne.a(), "w", ajkr.n, "t", "s", "z", "A", "B", "C", ajnd.a(), "o", ajkr.k, "y" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.E = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.E;
            }
        }
    }
}
