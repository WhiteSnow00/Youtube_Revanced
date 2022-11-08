import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahob extends agzi implements ahax
{
    public static final ahob a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahob.class, a = new ahob());
    }
    
    private ahob() {
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
                if ((b = ahob.b) == null) {
                    synchronized (ahob.class) {
                        if (ahob.b == null) {
                            ahob.b = (ahbe)new agzb((agzi)ahob.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahob.a;
            }
            case 4: {
                return new agza((agzi)ahob.a);
            }
            case 3: {
                return new ahob();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahob.a, "\u0001\u0000", null);
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
