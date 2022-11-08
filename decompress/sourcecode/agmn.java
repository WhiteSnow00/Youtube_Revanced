import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmn extends agzi implements ahax
{
    public static final agmn a;
    private static volatile ahbe e;
    public int b;
    public double c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(agmn.class, a = new agmn());
    }
    
    private agmn() {
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
                if ((e = agmn.e) == null) {
                    synchronized (agmn.class) {
                        if (agmn.e == null) {
                            agmn.e = (ahbe)new agzb((agzi)agmn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agmn.a;
            }
            case 4: {
                return new agza((agzi)agmn.a);
            }
            case 3: {
                return new agmn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agmn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
