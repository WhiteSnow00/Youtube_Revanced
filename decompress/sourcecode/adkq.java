import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkq extends agzi implements ahax
{
    public static final adkq a;
    private static volatile ahbe l;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public double i;
    public int j;
    public int k;
    private int m;
    
    static {
        agzi.registerDefaultInstance(adkq.class, a = new adkq());
    }
    
    private adkq() {
        this.f = 1;
        this.g = 1;
        this.h = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = adkq.l) == null) {
                    synchronized (adkq.class) {
                        if (adkq.l == null) {
                            adkq.l = (ahbe)new agzb((agzi)adkq.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return adkq.a;
            }
            case 4: {
                return new agza((agzi)adkq.a);
            }
            case 3: {
                return new adkq();
            }
            case 2: {
                final agzo i = akwf.l;
                final agzo k = akwf.k;
                return agzi.newMessageInfo((MessageLite)adkq.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u100c\u0006\b\u1000\u0007\t\u100c\b\n\u1004\t", new Object[] { "m", "b", "c", "d", "e", "f", i, "g", k, "h", k, "i", "j", akwf.m, "k" });
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
