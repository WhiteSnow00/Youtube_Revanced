import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdu extends agzi implements ahax
{
    public static final ahdu a;
    private static volatile ahbe g;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    
    static {
        agzi.registerDefaultInstance(ahdu.class, a = new ahdu());
    }
    
    private ahdu() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahdu.g) == null) {
                    synchronized (ahdu.class) {
                        if (ahdu.g == null) {
                            ahdu.g = (ahbe)new agzb((agzi)ahdu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahdu.a;
            }
            case 4: {
                return new agza((agzi)ahdu.a);
            }
            case 3: {
                return new ahdu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1000\u0002\u0004\u1000\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
