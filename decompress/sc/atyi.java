import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyi extends ahbh implements ahcw
{
    public static final atyi a;
    private static volatile ahdd x;
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
    public atyf u;
    public atyf v;
    public ahcr w;
    
    static {
        ahbh.registerDefaultInstance((Class)atyi.class, (ahbh)(a = new atyi()));
    }
    
    private atyi() {
        this.w = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd x;
                if ((x = atyi.x) == null) {
                    synchronized (atyi.class) {
                        if (atyi.x == null) {
                            atyi.x = (ahdd)new ahba((ahbh)atyi.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return atyi.a;
            }
            case 4: {
                return new ahaz((char[])null, (byte[][][])null);
            }
            case 3: {
                return new atyi();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyi.a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001\u1002\u0000\u0003\u1002\u0004\u0004\u1002\u0007\u0005\u1002\t\t\u1002\n\n\u1002\u000f\u000b\u1007\u0010\f\u1009\u0013\r\u1009\u0014\u000e\u1002\u0001\u000f\u1002\u0002\u00102\u0011\u1002\u0005\u0012\u1002\b\u0013\u1002\u0006\u0014\u1002\u000b\u0015\u1002\f\u0016\u100c\u0011\u0017\u1002\r\u0018\u1002\u000e\u0019\u1007\u0012", new Object[] { "b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", atyg.a, "g", "j", "h", "m", "n", "s", areg.p, "o", "p", "t" });
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
