import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahns extends agzi implements ahax
{
    public static final ahns a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahns.class, a = new ahns());
    }
    
    private ahns() {
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
                if ((b = ahns.b) == null) {
                    synchronized (ahns.class) {
                        if (ahns.b == null) {
                            ahns.b = (ahbe)new agzb((agzi)ahns.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahns.a;
            }
            case 4: {
                return new agza((agzi)ahns.a);
            }
            case 3: {
                return new ahns();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahns.a, "\u0001\u0000", null);
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
