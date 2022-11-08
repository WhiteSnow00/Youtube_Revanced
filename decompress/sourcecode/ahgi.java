import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgi extends agzi implements ahax
{
    public static final ahgi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahgi.class, a = new ahgi());
    }
    
    private ahgi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                if ((b = ahgi.b) == null) {
                    synchronized (ahgi.class) {
                        if (ahgi.b == null) {
                            ahgi.b = (ahbe)new agzb((agzi)ahgi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgi.a;
            }
            case 4: {
                return new agza((agzi)ahgi.a);
            }
            case 3: {
                return new ahgi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgi.a, "\u0001\u0000", null);
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
