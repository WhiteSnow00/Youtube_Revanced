import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agca extends agzi implements ahax
{
    public static final agca a;
    private static volatile ahbe e;
    public agcb b;
    public int c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agca.class, a = new agca());
    }
    
    private agca() {
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
                if ((e = agca.e) == null) {
                    synchronized (agca.class) {
                        if (agca.e == null) {
                            agca.e = (ahbe)new agzb((agzi)agca.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agca.a;
            }
            case 4: {
                return new agza((agzi)agca.a);
            }
            case 3: {
                return new agca();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agca.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[] { "b", "c", "d" });
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
