import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzt extends agzi implements ahax
{
    public static final ahzt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahzt.class, a = new ahzt());
    }
    
    private ahzt() {
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
                if ((b = ahzt.b) == null) {
                    synchronized (ahzt.class) {
                        if (ahzt.b == null) {
                            ahzt.b = (ahbe)new agzb((agzi)ahzt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahzt.a;
            }
            case 4: {
                return new agza((agzi)ahzt.a);
            }
            case 3: {
                return new ahzt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzt.a, "\u0001\u0000", null);
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
