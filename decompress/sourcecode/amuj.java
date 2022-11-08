import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuj extends agzi implements ahax
{
    public static final amuj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amuj.class, a = new amuj());
    }
    
    private amuj() {
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
                if ((b = amuj.b) == null) {
                    synchronized (amuj.class) {
                        if (amuj.b == null) {
                            amuj.b = (ahbe)new agzb((agzi)amuj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amuj.a;
            }
            case 4: {
                return new agza((agzi)amuj.a);
            }
            case 3: {
                return new amuj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuj.a, "\u0001\u0000", null);
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
