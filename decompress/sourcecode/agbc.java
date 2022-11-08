import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbc extends agzi implements ahax
{
    public static final agbc a;
    private static volatile ahbe d;
    public agbd b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agbc.class, a = new agbc());
    }
    
    private agbc() {
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
                if ((d = agbc.d) == null) {
                    synchronized (agbc.class) {
                        if (agbc.d == null) {
                            agbc.d = (ahbe)new agzb((agzi)agbc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbc.a;
            }
            case 4: {
                return new agza((agzi)agbc.a);
            }
            case 3: {
                return new agbc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbc.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "b", "c" });
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
