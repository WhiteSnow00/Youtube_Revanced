import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiu extends agzi implements ahax
{
    public static final ahiu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ahiu.class, (agzi)(a = new ahiu()));
    }
    
    private ahiu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahiu.b) == null) {
                    synchronized (ahiu.class) {
                        if (ahiu.b == null) {
                            ahiu.b = (ahbe)new agzb((agzi)ahiu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahiu.a;
            }
            case 4: {
                return new agza((agzi)ahiu.a);
            }
            case 3: {
                return new ahiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiu.a, "\u0001\u0000", (Object[])null);
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
