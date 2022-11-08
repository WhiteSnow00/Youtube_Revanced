import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agax extends agzi implements ahax
{
    public static final agax a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agax.class, a = new agax());
    }
    
    private agax() {
        this.d = agyc.b;
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
                if ((e = agax.e) == null) {
                    synchronized (agax.class) {
                        if (agax.e == null) {
                            agax.e = (ahbe)new agzb((agzi)agax.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agax.a;
            }
            case 4: {
                return new agza((agzi)agax.a);
            }
            case 3: {
                return new agax();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agax.a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[] { "b", "c", "d" });
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
