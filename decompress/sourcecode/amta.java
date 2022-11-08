import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amta extends agzi implements ahax
{
    public static final amta a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amta.class, a = new amta());
    }
    
    private amta() {
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
                if ((b = amta.b) == null) {
                    synchronized (amta.class) {
                        if (amta.b == null) {
                            amta.b = (ahbe)new agzb((agzi)amta.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amta.a;
            }
            case 4: {
                return new agza((agzi)amta.a);
            }
            case 3: {
                return new amta();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amta.a, "\u0001\u0000", null);
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
