import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahop extends agzi implements ahax
{
    public static final ahop a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahop.class, a = new ahop());
    }
    
    private ahop() {
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
                if ((b = ahop.b) == null) {
                    synchronized (ahop.class) {
                        if (ahop.b == null) {
                            ahop.b = (ahbe)new agzb((agzi)ahop.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahop.a;
            }
            case 4: {
                return new agza((agzi)ahop.a);
            }
            case 3: {
                return new ahop();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahop.a, "\u0001\u0000", null);
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
