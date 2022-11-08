import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwt extends agzi implements ahax
{
    public static final atwt a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    
    static {
        agzi.registerDefaultInstance(atwt.class, a = new atwt());
    }
    
    private atwt() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = atwt.j) == null) {
                    synchronized (atwt.class) {
                        if (atwt.j == null) {
                            atwt.j = (ahbe)new agzb((agzi)atwt.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return atwt.a;
            }
            case 4: {
                return new agza((agzi)atwt.a);
            }
            case 3: {
                return new atwt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwt.a, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011\u1004\u0011\u0012\u1004\u0012\u0014\u1002\u0013\u0015\u1002\u0014\u0016\u1002\u0015\u0017\u1002\u0016\u0018\u1002\u0017", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
