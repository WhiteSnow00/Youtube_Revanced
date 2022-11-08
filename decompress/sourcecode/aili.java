import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aili extends agzi implements ahax
{
    public static final aili a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aili.class, a = new aili());
    }
    
    private aili() {
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
                if ((b = aili.b) == null) {
                    synchronized (aili.class) {
                        if (aili.b == null) {
                            aili.b = (ahbe)new agzb((agzi)aili.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aili.a;
            }
            case 4: {
                return new agza((agzi)aili.a);
            }
            case 3: {
                return new aili();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aili.a, "\u0001\u0000", null);
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
