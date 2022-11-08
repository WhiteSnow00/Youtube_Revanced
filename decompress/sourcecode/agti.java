import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agti extends agzi implements ahax
{
    public static final agti a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agti.class, a = new agti());
    }
    
    private agti() {
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
                if ((b = agti.b) == null) {
                    synchronized (agti.class) {
                        if (agti.b == null) {
                            agti.b = (ahbe)new agzb((agzi)agti.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agti.a;
            }
            case 4: {
                return new agza((agzi)agti.a);
            }
            case 3: {
                return new agti();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agti.a, "\u0001\u0000", null);
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
