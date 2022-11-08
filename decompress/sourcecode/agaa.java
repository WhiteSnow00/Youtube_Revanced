import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaa extends agzi implements ahax
{
    public static final agaa a;
    private static volatile ahbe e;
    public int b;
    public agac c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agaa.class, a = new agaa());
    }
    
    private agaa() {
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
                if ((e = agaa.e) == null) {
                    synchronized (agaa.class) {
                        if (agaa.e == null) {
                            agaa.e = (ahbe)new agzb((agzi)agaa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agaa.a;
            }
            case 4: {
                return new agza((agzi)agaa.a);
            }
            case 3: {
                return new agaa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agaa.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
