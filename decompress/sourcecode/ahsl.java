import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsl extends agzi implements ahax
{
    public static final ahsl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahsl.class, a = new ahsl());
    }
    
    private ahsl() {
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
                if ((b = ahsl.b) == null) {
                    synchronized (ahsl.class) {
                        if (ahsl.b == null) {
                            ahsl.b = (ahbe)new agzb((agzi)ahsl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahsl.a;
            }
            case 4: {
                return new agza((agzi)ahsl.a);
            }
            case 3: {
                return new ahsl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsl.a, "\u0001\u0000", null);
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
