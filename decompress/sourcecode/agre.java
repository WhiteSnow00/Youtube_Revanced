import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agre extends agzi implements ahax
{
    public static final agre a;
    private static volatile ahbe d;
    public int b;
    public agrg c;
    
    static {
        agzi.registerDefaultInstance(agre.class, a = new agre());
    }
    
    private agre() {
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
                if ((d = agre.d) == null) {
                    synchronized (agre.class) {
                        if (agre.d == null) {
                            agre.d = (ahbe)new agzb((agzi)agre.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agre.a;
            }
            case 4: {
                return new agza((agzi)agre.a);
            }
            case 3: {
                return new agre();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agre.a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\t", new Object[] { "b", "c" });
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
