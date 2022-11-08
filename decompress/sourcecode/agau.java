import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agau extends agzi implements ahax
{
    public static final agau a;
    private static volatile ahbe e;
    public agax b;
    public agas c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agau.class, a = new agau());
    }
    
    private agau() {
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
                if ((e = agau.e) == null) {
                    synchronized (agau.class) {
                        if (agau.e == null) {
                            agau.e = (ahbe)new agzb((agzi)agau.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agau.a;
            }
            case 4: {
                return new agza((agzi)agau.a);
            }
            case 3: {
                return new agau();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agau.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "b", "c", "d" });
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
