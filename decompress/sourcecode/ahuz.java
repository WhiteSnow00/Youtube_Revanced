import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuz extends agzi implements ahax
{
    public static final ahuz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahuz.class, a = new ahuz());
    }
    
    private ahuz() {
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
                if ((b = ahuz.b) == null) {
                    synchronized (ahuz.class) {
                        if (ahuz.b == null) {
                            ahuz.b = (ahbe)new agzb((agzi)ahuz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahuz.a;
            }
            case 4: {
                return new agza((agzi)ahuz.a);
            }
            case 3: {
                return new ahuz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuz.a, "\u0001\u0000", null);
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
