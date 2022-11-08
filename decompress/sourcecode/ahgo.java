import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgo extends agzi implements ahax
{
    public static final ahgo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahgo.class, a = new ahgo());
    }
    
    private ahgo() {
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
                if ((b = ahgo.b) == null) {
                    synchronized (ahgo.class) {
                        if (ahgo.b == null) {
                            ahgo.b = (ahbe)new agzb((agzi)ahgo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgo.a;
            }
            case 4: {
                return new agza((agzi)ahgo.a);
            }
            case 3: {
                return new ahgo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgo.a, "\u0001\u0000", null);
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
