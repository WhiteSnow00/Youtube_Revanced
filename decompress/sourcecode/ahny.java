import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahny extends agzi implements ahax
{
    public static final ahny a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahny.class, a = new ahny());
    }
    
    private ahny() {
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
                if ((b = ahny.b) == null) {
                    synchronized (ahny.class) {
                        if (ahny.b == null) {
                            ahny.b = (ahbe)new agzb((agzi)ahny.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahny.a;
            }
            case 4: {
                return new agza((agzi)ahny.a);
            }
            case 3: {
                return new ahny();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahny.a, "\u0001\u0000", null);
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
