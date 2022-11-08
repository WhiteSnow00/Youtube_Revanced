import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbs extends agzi implements ahax
{
    public static final agbs a;
    private static volatile ahbe d;
    public int b;
    public agbt c;
    
    static {
        agzi.registerDefaultInstance(agbs.class, a = new agbs());
    }
    
    private agbs() {
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
                if ((d = agbs.d) == null) {
                    synchronized (agbs.class) {
                        if (agbs.d == null) {
                            agbs.d = (ahbe)new agzb((agzi)agbs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbs.a;
            }
            case 4: {
                return new agza((agzi)agbs.a);
            }
            case 3: {
                return new agbs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbs.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "b", "c" });
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
