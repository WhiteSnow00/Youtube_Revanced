import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepr extends agzi implements ahax
{
    public static final aepr a;
    private static volatile ahbe g;
    public int b;
    public aepu c;
    public long d;
    public long e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(aepr.class, a = new aepr());
    }
    
    private aepr() {
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
                if ((g = aepr.g) == null) {
                    synchronized (aepr.class) {
                        if (aepr.g == null) {
                            aepr.g = (ahbe)new agzb((agzi)aepr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aepr.a;
            }
            case 4: {
                return new agza((agzi)aepr.a);
            }
            case 3: {
                return new aepr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aepr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
