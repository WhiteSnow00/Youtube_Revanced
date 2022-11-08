import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agao extends agzi implements ahax
{
    public static final agao a;
    private static volatile ahbe c;
    public agap b;
    
    static {
        agzi.registerDefaultInstance(agao.class, a = new agao());
    }
    
    private agao() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agao.c) == null) {
                    synchronized (agao.class) {
                        if (agao.c == null) {
                            agao.c = (ahbe)new agzb((agzi)agao.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agao.a;
            }
            case 4: {
                return new agza((agzi)agao.a);
            }
            case 3: {
                return new agao();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agao.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "b" });
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
