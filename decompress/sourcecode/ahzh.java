import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzh extends agzi implements ahax
{
    public static final ahzh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahzh.class, a = new ahzh());
    }
    
    private ahzh() {
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
                if ((b = ahzh.b) == null) {
                    synchronized (ahzh.class) {
                        if (ahzh.b == null) {
                            ahzh.b = (ahbe)new agzb((agzi)ahzh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahzh.a;
            }
            case 4: {
                return new agza((agzi)ahzh.a);
            }
            case 3: {
                return new ahzh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzh.a, "\u0001\u0000", null);
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
