import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfp extends agzi implements ahax
{
    public static final agfp a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(agfp.class, a = new agfp());
    }
    
    private agfp() {
        this.c = 0;
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
                if ((f = agfp.f) == null) {
                    synchronized (agfp.class) {
                        if (agfp.f == null) {
                            agfp.f = (ahbe)new agzb((agzi)agfp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agfp.a;
            }
            case 4: {
                return new agza((agzi)agfp.a);
            }
            case 3: {
                return new agfp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfp.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000", new Object[] { "d", "c", "b", "e", agfh.class, agff.class, agfj.class, agfb.class, agfo.class, agfn.class, agfm.class });
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
