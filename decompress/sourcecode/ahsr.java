import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsr extends agzi implements ahax
{
    public static final ahsr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahsr.class, a = new ahsr());
    }
    
    private ahsr() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahsr.b) == null) {
                    synchronized (ahsr.class) {
                        if (ahsr.b == null) {
                            ahsr.b = (ahbe)new agzb((agzi)ahsr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahsr.a;
            }
            case 4: {
                return new agza((agzi)ahsr.a);
            }
            case 3: {
                return new ahsr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsr.a, "\u0001\u0000", null);
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
