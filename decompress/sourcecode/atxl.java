import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxl extends agzi implements ahax
{
    public static final atxl a;
    private static volatile ahbe x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public atxi u;
    public atxi v;
    public ahas w;
    
    static {
        agzi.registerDefaultInstance(atxl.class, a = new atxl());
    }
    
    private atxl() {
        this.w = ahas.a;
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
                if ((x = atxl.x) == null) {
                    synchronized (atxl.class) {
                        if (atxl.x == null) {
                            atxl.x = (ahbe)new agzb((agzi)atxl.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return atxl.a;
            }
            case 4: {
                return new agza((short[])null, (boolean[])null);
            }
            case 3: {
                return new atxl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxl.a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001\u1002\u0000\u0003\u1002\u0004\u0004\u1002\u0007\u0005\u1002\t\t\u1002\n\n\u1002\u000f\u000b\u1007\u0010\f\u1009\u0013\r\u1009\u0014\u000e\u1002\u0001\u000f\u1002\u0002\u00102\u0011\u1002\u0005\u0012\u1002\b\u0013\u1002\u0006\u0014\u1002\u000b\u0015\u1002\f\u0016\u100c\u0011\u0017\u1002\r\u0018\u1002\u000e\u0019\u1007\u0012", new Object[] { "b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", atxj.a, "g", "j", "h", "m", "n", "s", arbt.o, "o", "p", "t" });
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
