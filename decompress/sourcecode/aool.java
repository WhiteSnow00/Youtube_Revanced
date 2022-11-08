import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aool extends agzi implements ahax
{
    public static final aool a;
    private static volatile ahbe r;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    private int s;
    
    static {
        agzi.registerDefaultInstance((Class)aool.class, (agzi)(a = new aool()));
    }
    
    private aool() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe r;
                if ((r = aool.r) == null) {
                    synchronized (aool.class) {
                        if (aool.r == null) {
                            aool.r = (ahbe)new agzb((agzi)aool.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aool.a;
            }
            case 4: {
                return new agza((agzi)aool.a);
            }
            case 3: {
                return new aool();
            }
            case 2: {
                return newMessageInfo((MessageLite)aool.a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0005\u1004\u0003\u0006\u1004\u0004\t\u1004\u0007\n\u1004\b\u000b\u1004\t\f\u1004\n\r\u1004\u000b\u000e\u1004\f\u000f\u1004\r\u0010\u1004\u000e\u0011\u1004\u000f\u0013\u1004\u0011\u0014\u1004\u0012", new Object[] { "s", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" });
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
