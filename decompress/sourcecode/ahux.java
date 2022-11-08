import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahux extends agzi implements ahax
{
    public static final ahux a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahux.class, a = new ahux());
    }
    
    private ahux() {
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
                if ((b = ahux.b) == null) {
                    synchronized (ahux.class) {
                        if (ahux.b == null) {
                            ahux.b = (ahbe)new agzb((agzi)ahux.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahux.a;
            }
            case 4: {
                return new agza((agzi)ahux.a);
            }
            case 3: {
                return new ahux();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahux.a, "\u0001\u0000", null);
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
