import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agth extends agzi implements ahax
{
    public static final agth a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agth.class, a = new agth());
    }
    
    private agth() {
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
                if ((b = agth.b) == null) {
                    synchronized (agth.class) {
                        if (agth.b == null) {
                            agth.b = (ahbe)new agzb((agzi)agth.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agth.a;
            }
            case 4: {
                return new agza((agzi)agth.a);
            }
            case 3: {
                return new agth();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agth.a, "\u0001\u0000", null);
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
