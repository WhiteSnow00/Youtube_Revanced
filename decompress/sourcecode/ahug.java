import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahug extends agzi implements ahax
{
    public static final ahug a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahug.class, a = new ahug());
    }
    
    private ahug() {
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
                if ((b = ahug.b) == null) {
                    synchronized (ahug.class) {
                        if (ahug.b == null) {
                            ahug.b = (ahbe)new agzb((agzi)ahug.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahug.a;
            }
            case 4: {
                return new agza((agzi)ahug.a);
            }
            case 3: {
                return new ahug();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahug.a, "\u0001\u0000", null);
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
