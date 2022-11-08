import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptj extends agzi implements ahax
{
    public static final aptj a;
    private static volatile ahbe q;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public boolean i;
    public ajsq j;
    public aibc k;
    public ajsq l;
    public ajsq m;
    public aioe n;
    public agzy o;
    public aioe p;
    private aibc r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance((Class)aptj.class, (agzi)(a = new aptj()));
    }
    
    private aptj() {
        this.s = 2;
        this.f = 10000;
        emptyProtobufList();
        this.o = emptyProtobufList();
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
                final ahbe q;
                if ((q = aptj.q) == null) {
                    synchronized (aptj.class) {
                        if (aptj.q == null) {
                            aptj.q = (ahbe)new agzb((agzi)aptj.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return aptj.a;
            }
            case 4: {
                return new agza((agzi)aptj.a);
            }
            case 3: {
                return new aptj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptj.a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\b\u0001\u1002\u0000\u0003\u1409\n\u0004\u1409\u000b\u0005\u100b\u0003\u0006\u1409\f\u0007\u1409\u000e\n\u1409\r\u000b\u1004\u0001\r\u041b\u000e\u100c\u0004\u000f\u1002\u0005\u0011\u1409\u0010\u0012\u1007\u0007\u0013\u100b\u0002\u0014\u1409\u000f", new Object[] { "b", "c", "j", "k", "f", "l", "m", "r", "d", "o", aioe.class, "g", apti.a(), "h", "p", "i", "e", "n" });
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
