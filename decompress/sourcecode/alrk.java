import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrk extends agzi implements ahax
{
    public static final alrk a;
    private static volatile ahbe x;
    public int b;
    public int c;
    public String d;
    public String e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public long q;
    public int r;
    public long s;
    public long t;
    public long u;
    public int v;
    public long w;
    
    static {
        agzi.registerDefaultInstance(alrk.class, a = new alrk());
    }
    
    private alrk() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe x;
                if ((x = alrk.x) == null) {
                    synchronized (alrk.class) {
                        if (alrk.x == null) {
                            alrk.x = (ahbe)new agzb((agzi)alrk.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return alrk.a;
            }
            case 4: {
                return new agza((agzi)alrk.a);
            }
            case 3: {
                return new alrk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrk.a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0000\u0000\u0000\u0001\u1002\u0003\u0004\u1002\u0010\u0006\u1004\u0013\u0007\u1002\u0014\b\u1004\u0017\t\u1002\u0018\n\u100c\u0000\u000b\u1008\u0001\f\u1008\u0002\r\u1002\u0004\u000e\u1002\u0015\u000f\u1002\u0016\u0010\u1004\u000b\u0011\u1004\u000e\u0012\u1004\u0005\u0013\u1004\u0006\u0015\u1004\b\u0016\u1004\f\u0017\u1004\u000f\u0018\u1004\t\u0019\u1002\u0011", new Object[] { "b", "f", "p", "r", "s", "v", "w", "c", alll.q, "d", "e", "g", "t", "u", "l", "n", "h", "i", "j", "m", "o", "k", "q" });
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
