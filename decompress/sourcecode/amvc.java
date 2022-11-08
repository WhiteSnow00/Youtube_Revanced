import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvc extends agzi implements ahax
{
    public static final amvc a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amvc.class, a = new amvc());
    }
    
    private amvc() {
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
                if ((b = amvc.b) == null) {
                    synchronized (amvc.class) {
                        if (amvc.b == null) {
                            amvc.b = (ahbe)new agzb((agzi)amvc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amvc.a;
            }
            case 4: {
                return new agza((agzi)amvc.a);
            }
            case 3: {
                return new amvc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvc.a, "\u0001\u0000", null);
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
