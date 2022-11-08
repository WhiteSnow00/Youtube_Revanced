import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsa extends agzi implements ahax
{
    public static final amsa a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amsa.class, a = new amsa());
    }
    
    private amsa() {
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
                if ((b = amsa.b) == null) {
                    synchronized (amsa.class) {
                        if (amsa.b == null) {
                            amsa.b = (ahbe)new agzb((agzi)amsa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amsa.a;
            }
            case 4: {
                return new agza((agzi)amsa.a);
            }
            case 3: {
                return new amsa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsa.a, "\u0001\u0000", null);
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
