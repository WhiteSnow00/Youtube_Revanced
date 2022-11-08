import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpq extends agzi implements ahax
{
    public static final afpq a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public long d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(afpq.class, a = new afpq());
    }
    
    private afpq() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = afpq.f) == null) {
                    synchronized (afpq.class) {
                        if (afpq.f == null) {
                            afpq.f = (ahbe)new agzb((agzi)afpq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpq.a;
            }
            case 4: {
                return new agza((agzi)afpq.a);
            }
            case 3: {
                return new afpq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
