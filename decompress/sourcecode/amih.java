import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amih extends agzi implements ahax
{
    public static final amih a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)amih.class, (agzi)(a = new amih()));
    }
    
    private amih() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amih.b) == null) {
                    synchronized (amih.class) {
                        if (amih.b == null) {
                            amih.b = (ahbe)new agzb((agzi)amih.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amih.a;
            }
            case 4: {
                return new agza((agzi)amih.a);
            }
            case 3: {
                return new amih();
            }
            case 2: {
                return newMessageInfo((MessageLite)amih.a, "\u0001\u0000", (Object[])null);
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
