import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lps extends agzi implements ahax
{
    public static final lps a;
    private static volatile ahbe r;
    public int b;
    public String c;
    public String d;
    public agyc e;
    public long f;
    public String g;
    public long h;
    public int i;
    public String j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    
    static {
        agzi.registerDefaultInstance(lps.class, a = new lps());
    }
    
    private lps() {
        this.c = "";
        this.d = "";
        this.e = agyc.b;
        this.g = "";
        this.j = "";
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
                if ((r = lps.r) == null) {
                    synchronized (lps.class) {
                        if (lps.r == null) {
                            lps.r = (ahbe)new agzb((agzi)lps.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return lps.a;
            }
            case 4: {
                return new agza((agzi)lps.a);
            }
            case 3: {
                return new lps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lps.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1002\u0005\u0007\u1004\u0006\b\u1008\u0007\t\u1007\b\n\u100c\t\u000b\u1004\n\f\u1004\u000b\u000e\u1004\r\u000f\u1004\u000e\u0010\u1004\u000f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", ajbl.a(), "m", "n", "o", "p", "q" });
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
