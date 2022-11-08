import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqx extends agzi implements ahax
{
    public static final aoqx a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aoqx.class, a = new aoqx());
    }
    
    private aoqx() {
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
                if ((b = aoqx.b) == null) {
                    synchronized (aoqx.class) {
                        if (aoqx.b == null) {
                            aoqx.b = (ahbe)new agzb((agzi)aoqx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqx.a;
            }
            case 4: {
                return new agza((agzi)aoqx.a);
            }
            case 3: {
                return new aoqx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqx.a, "\u0001\u0000", null);
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
