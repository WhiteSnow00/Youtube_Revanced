import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkr extends agzi implements ahax
{
    public static final adkr a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    
    static {
        agzi.registerDefaultInstance(adkr.class, a = new adkr());
    }
    
    private adkr() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = adkr.h) == null) {
                    synchronized (adkr.class) {
                        if (adkr.h == null) {
                            adkr.h = (ahbe)new agzb((agzi)adkr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return adkr.a;
            }
            case 4: {
                return new agza((agzi)adkr.a);
            }
            case 3: {
                return new adkr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adkr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100b\u0002\u0004\u1003\u0003\u0005\u1003\u0004", new Object[] { "b", "c", pdu.p, "d", apfr.a(), "e", "f", "g" });
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
