import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhl extends agzi implements ahax
{
    public static final ahhl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahhl.class, a = new ahhl());
    }
    
    private ahhl() {
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
                if ((b = ahhl.b) == null) {
                    synchronized (ahhl.class) {
                        if (ahhl.b == null) {
                            ahhl.b = (ahbe)new agzb((agzi)ahhl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhl.a;
            }
            case 4: {
                return new agza((agzi)ahhl.a);
            }
            case 3: {
                return new ahhl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhl.a, "\u0001\u0000", null);
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
