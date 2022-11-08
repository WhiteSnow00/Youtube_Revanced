import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmr extends agzi implements ahax
{
    public static final fmr a;
    private static volatile ahbe k;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public long g;
    public boolean h;
    public long i;
    public int j;
    
    static {
        agzi.registerDefaultInstance((Class)fmr.class, (agzi)(a = new fmr()));
    }
    
    private fmr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = fmr.k) == null) {
                    synchronized (fmr.class) {
                        if (fmr.k == null) {
                            fmr.k = (ahbe)new agzb((agzi)fmr.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return fmr.a;
            }
            case 4: {
                return new agza((agzi)fmr.a);
            }
            case 3: {
                return new fmr();
            }
            case 2: {
                return newMessageInfo((MessageLite)fmr.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1002\u0004\u0006\u1007\u0005\u0007\u1002\u0006\b\u100c\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", amuv.a() });
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
