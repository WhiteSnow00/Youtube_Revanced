import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agns extends agzi implements ahax
{
    public static final agns a;
    private static volatile ahbe c;
    public agnu b;
    
    static {
        agzi.registerDefaultInstance(agns.class, a = new agns());
    }
    
    private agns() {
        final agyc b = agyc.b;
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
                if ((c = agns.c) == null) {
                    synchronized (agns.class) {
                        if (agns.c == null) {
                            agns.c = (ahbe)new agzb((agzi)agns.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agns.a;
            }
            case 4: {
                return new agza((agzi)agns.a);
            }
            case 3: {
                return new agns();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agns.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
