import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahip extends agzi implements ahax
{
    public static final ahip a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahip.class, a = new ahip());
    }
    
    private ahip() {
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
                if ((b = ahip.b) == null) {
                    synchronized (ahip.class) {
                        if (ahip.b == null) {
                            ahip.b = (ahbe)new agzb((agzi)ahip.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahip.a;
            }
            case 4: {
                return new agza((agzi)ahip.a);
            }
            case 3: {
                return new ahip();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahip.a, "\u0001\u0000", null);
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
