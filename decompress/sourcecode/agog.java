import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agog extends agzi implements ahax
{
    public static final agog a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(agog.class, a = new agog());
    }
    
    private agog() {
        this.c = "";
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
                if ((d = agog.d) == null) {
                    synchronized (agog.class) {
                        if (agog.d == null) {
                            agog.d = (ahbe)new agzb((agzi)agog.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agog.a;
            }
            case 4: {
                return new agza((agzi)agog.a);
            }
            case 3: {
                return new agog();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agog.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
