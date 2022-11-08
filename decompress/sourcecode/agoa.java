import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoa extends agzi implements ahax
{
    public static final agoa a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agoa.class, a = new agoa());
    }
    
    private agoa() {
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
                if ((b = agoa.b) == null) {
                    synchronized (agoa.class) {
                        if (agoa.b == null) {
                            agoa.b = (ahbe)new agzb((agzi)agoa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agoa.a;
            }
            case 4: {
                return new agza((agzi)agoa.a);
            }
            case 3: {
                return new agoa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoa.a, "\u0000\u0000", null);
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
