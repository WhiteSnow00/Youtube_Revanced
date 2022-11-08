import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoa extends agzi implements ahax
{
    public static final ahoa a;
    private static volatile ahbe e;
    public int b;
    public ahoh c;
    public ahnm d;
    
    static {
        agzi.registerDefaultInstance(ahoa.class, a = new ahoa());
    }
    
    private ahoa() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahoa.e) == null) {
                    synchronized (ahoa.class) {
                        if (ahoa.e == null) {
                            ahoa.e = (ahbe)new agzb((agzi)ahoa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahoa.a;
            }
            case 4: {
                return new agza((agzi)ahoa.a);
            }
            case 3: {
                return new ahoa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoa.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
