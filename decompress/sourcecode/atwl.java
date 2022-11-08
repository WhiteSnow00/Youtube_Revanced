import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwl extends agzi implements ahax
{
    public static final atwl a;
    private static volatile ahbe j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public atwi i;
    
    static {
        agzi.registerDefaultInstance(atwl.class, a = new atwl());
    }
    
    private atwl() {
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
                if ((j = atwl.j) == null) {
                    synchronized (atwl.class) {
                        if (atwl.j == null) {
                            atwl.j = (ahbe)new agzb((agzi)atwl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return atwl.a;
            }
            case 4: {
                return new agza((agzi)atwl.a);
            }
            case 3: {
                return new atwl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwl.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1009\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
