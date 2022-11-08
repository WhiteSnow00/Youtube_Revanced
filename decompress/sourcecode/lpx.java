import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpx extends agzi implements ahax
{
    public static final lpx a;
    private static volatile ahbe r;
    public int b;
    public String c;
    public int d;
    public String e;
    public agzy f;
    public agzq g;
    public agyc h;
    public long i;
    public String j;
    public long k;
    public int l;
    public long m;
    public long n;
    public long o;
    public agzt p;
    public String q;
    
    static {
        agzi.registerDefaultInstance(lpx.class, a = new lpx());
    }
    
    private lpx() {
        this.c = "";
        this.e = "";
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyIntList();
        this.h = agyc.b;
        this.j = "";
        this.p = agzi.emptyLongList();
        this.q = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe r;
                if ((r = lpx.r) == null) {
                    synchronized (lpx.class) {
                        if (lpx.r == null) {
                            lpx.r = (ahbe)new agzb((agzi)lpx.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return lpx.a;
            }
            case 4: {
                return new agza((agzi)lpx.a);
            }
            case 3: {
                return new lpx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpx.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0003\u0000\u0001\u1008\u0000\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u001b\u0006\u100a\u0004\u0007\u1002\u0005\b\u1008\u0006\t\u1002\u0007\n\u1004\b\u000b\u1002\t\f\u1002\n\r\u1002\u000b\u000e\u0014\u000f\u1008\f\u0010\u0016", new Object[] { "b", "c", "d", "e", "f", lpt.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
