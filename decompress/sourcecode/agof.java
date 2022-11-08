import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agof extends agzi implements ahax
{
    public static final agof a;
    private static volatile ahbe h;
    public agoc b;
    public agoa c;
    public agnz d;
    public agob e;
    public agnw f;
    public agnx g;
    private ahas i;
    
    static {
        agzi.registerDefaultInstance(agof.class, a = new agof());
    }
    
    private agof() {
        this.i = ahas.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = agof.h) == null) {
                    synchronized (agof.class) {
                        if (agof.h == null) {
                            agof.h = (ahbe)new agzb((agzi)agof.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agof.a;
            }
            case 4: {
                return new agza((agzi)agof.a);
            }
            case 3: {
                return new agof();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agof.a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[] { "b", "c", "d", "f", "i", agoe.a, "e", "g" });
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
