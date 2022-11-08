import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoe extends agzi implements ahax
{
    public static final ahoe a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahoe.class, a = new ahoe());
    }
    
    private ahoe() {
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
                if ((b = ahoe.b) == null) {
                    synchronized (ahoe.class) {
                        if (ahoe.b == null) {
                            ahoe.b = (ahbe)new agzb((agzi)ahoe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahoe.a;
            }
            case 4: {
                return new agza((agzi)ahoe.a);
            }
            case 3: {
                return new ahoe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoe.a, "\u0001\u0000", null);
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
