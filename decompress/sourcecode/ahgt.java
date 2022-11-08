import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgt extends agzi implements ahax
{
    public static final ahgt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahgt.class, a = new ahgt());
    }
    
    private ahgt() {
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
                if ((b = ahgt.b) == null) {
                    synchronized (ahgt.class) {
                        if (ahgt.b == null) {
                            ahgt.b = (ahbe)new agzb((agzi)ahgt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgt.a;
            }
            case 4: {
                return new agza((agzi)ahgt.a);
            }
            case 3: {
                return new ahgt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgt.a, "\u0001\u0000", null);
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
