import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuh extends agzi implements ahax
{
    public static final ahuh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahuh.class, a = new ahuh());
    }
    
    private ahuh() {
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
                if ((b = ahuh.b) == null) {
                    synchronized (ahuh.class) {
                        if (ahuh.b == null) {
                            ahuh.b = (ahbe)new agzb((agzi)ahuh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahuh.a;
            }
            case 4: {
                return new agza((agzi)ahuh.a);
            }
            case 3: {
                return new ahuh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuh.a, "\u0001\u0000", null);
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
