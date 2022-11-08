import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpo extends agzi implements ahax
{
    public static final agpo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agpo.class, a = new agpo());
    }
    
    private agpo() {
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
                if ((b = agpo.b) == null) {
                    synchronized (agpo.class) {
                        if (agpo.b == null) {
                            agpo.b = (ahbe)new agzb((agzi)agpo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agpo.a;
            }
            case 4: {
                return new agza((agzi)agpo.a);
            }
            case 3: {
                return new agpo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpo.a, "\u0001\u0000", null);
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
