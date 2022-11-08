import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnn extends agzi implements ahax
{
    public static final agnn a;
    private static volatile ahbe e;
    public agoj b;
    public agnv c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agnn.class, a = new agnn());
    }
    
    private agnn() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agnn.e) == null) {
                    synchronized (agnn.class) {
                        if (agnn.e == null) {
                            agnn.e = (ahbe)new agzb((agzi)agnn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agnn.a;
            }
            case 4: {
                return new agza((agzi)agnn.a);
            }
            case 3: {
                return new agnn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnn.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "b", "c", "d" });
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
