import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agap extends agzi implements ahax
{
    public static final agap a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agap.class, a = new agap());
    }
    
    private agap() {
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
                if ((e = agap.e) == null) {
                    synchronized (agap.class) {
                        if (agap.e == null) {
                            agap.e = (ahbe)new agzb((agzi)agap.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agap.a;
            }
            case 4: {
                return new agza((agzi)agap.a);
            }
            case 3: {
                return new agap();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agap.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[] { "b", "c", "d" });
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
