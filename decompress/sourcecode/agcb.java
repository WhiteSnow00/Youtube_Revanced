import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agcb extends agzi implements ahax
{
    public static final agcb a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agcb.class, a = new agcb());
    }
    
    private agcb() {
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
                if ((e = agcb.e) == null) {
                    synchronized (agcb.class) {
                        if (agcb.e == null) {
                            agcb.e = (ahbe)new agzb((agzi)agcb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agcb.a;
            }
            case 4: {
                return new agza((agzi)agcb.a);
            }
            case 3: {
                return new agcb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agcb.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[] { "b", "c", "d" });
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
