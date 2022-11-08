import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbm extends agzi implements ahax
{
    public static final agbm a;
    private static volatile ahbe f;
    public agbj b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agbm.class, a = new agbm());
    }
    
    private agbm() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = agbm.f) == null) {
                    synchronized (agbm.class) {
                        if (agbm.f == null) {
                            agbm.f = (ahbe)new agzb((agzi)agbm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agbm.a;
            }
            case 4: {
                return new agza((agzi)agbm.a);
            }
            case 3: {
                return new agbm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbm.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[] { "b", "c", "d", "e" });
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
