import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqn extends agzi implements ahax
{
    public static final agqn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agqn.class, a = new agqn());
    }
    
    private agqn() {
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
                if ((b = agqn.b) == null) {
                    synchronized (agqn.class) {
                        if (agqn.b == null) {
                            agqn.b = (ahbe)new agzb((agzi)agqn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqn.a;
            }
            case 4: {
                return new agza((agzi)agqn.a);
            }
            case 3: {
                return new agqn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqn.a, "\u0001\u0000", null);
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
