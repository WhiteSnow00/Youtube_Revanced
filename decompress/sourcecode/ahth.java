import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahth extends agzi implements ahax
{
    public static final ahth a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahth.class, a = new ahth());
    }
    
    private ahth() {
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
                if ((b = ahth.b) == null) {
                    synchronized (ahth.class) {
                        if (ahth.b == null) {
                            ahth.b = (ahbe)new agzb((agzi)ahth.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahth.a;
            }
            case 4: {
                return new agza((agzi)ahth.a);
            }
            case 3: {
                return new ahth();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahth.a, "\u0001\u0000", null);
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
