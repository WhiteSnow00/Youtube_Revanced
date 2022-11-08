import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzi extends agzi implements ahax
{
    public static final ahzi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahzi.class, a = new ahzi());
    }
    
    private ahzi() {
        emptyProtobufList();
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
                if ((b = ahzi.b) == null) {
                    synchronized (ahzi.class) {
                        if (ahzi.b == null) {
                            ahzi.b = (ahbe)new agzb((agzi)ahzi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahzi.a;
            }
            case 4: {
                return new agza((agzi)ahzi.a);
            }
            case 3: {
                return new ahzi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzi.a, "\u0001\u0000", null);
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
