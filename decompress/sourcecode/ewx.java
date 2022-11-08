import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewx extends agzi implements ahax
{
    public static final ewx a;
    private static volatile ahbe n;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    
    static {
        agzi.registerDefaultInstance(ewx.class, a = new ewx());
    }
    
    private ewx() {
        this.d = 1380;
        this.e = 300;
        this.f = true;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = ewx.n) == null) {
                    synchronized (ewx.class) {
                        if (ewx.n == null) {
                            ewx.n = (ahbe)new agzb((agzi)ewx.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ewx.a;
            }
            case 4: {
                return new agza((agzi)ewx.a);
            }
            case 3: {
                return new ewx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ewx.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u1002\u0004\u0006\u1007\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1004\b\n\u1007\t\u000b\u1004\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
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
