import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzv extends agzi implements ahax
{
    public static final ahzv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahzv.class, a = new ahzv());
    }
    
    private ahzv() {
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
                if ((b = ahzv.b) == null) {
                    synchronized (ahzv.class) {
                        if (ahzv.b == null) {
                            ahzv.b = (ahbe)new agzb((agzi)ahzv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahzv.a;
            }
            case 4: {
                return new agza((agzi)ahzv.a);
            }
            case 3: {
                return new ahzv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzv.a, "\u0001\u0000", null);
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
