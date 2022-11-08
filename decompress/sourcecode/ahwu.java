import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwu extends agzi implements ahax
{
    public static final ahwu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahwu.class, a = new ahwu());
    }
    
    private ahwu() {
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
                if ((b = ahwu.b) == null) {
                    synchronized (ahwu.class) {
                        if (ahwu.b == null) {
                            ahwu.b = (ahbe)new agzb((agzi)ahwu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahwu.a;
            }
            case 4: {
                return new agza((agzi)ahwu.a);
            }
            case 3: {
                return new ahwu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwu.a, "\u0001\u0000", null);
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
