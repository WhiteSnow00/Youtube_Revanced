import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agql extends agzi implements ahax
{
    public static final agql a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(agql.class, a = new agql());
    }
    
    private agql() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agql.d) == null) {
                    synchronized (agql.class) {
                        if (agql.d == null) {
                            agql.d = (ahbe)new agzb((agzi)agql.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agql.a;
            }
            case 4: {
                return new agza((agzi)agql.a);
            }
            case 3: {
                return new agql();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agql.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1007\u0002", new Object[] { "b", "c" });
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
