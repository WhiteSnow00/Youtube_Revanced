import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeps extends agzi implements ahax
{
    public static final aeps a;
    private static volatile ahbe g;
    public int b;
    public long c;
    public agzy d;
    public long e;
    public agzq f;
    
    static {
        agzi.registerDefaultInstance(aeps.class, a = new aeps());
    }
    
    private aeps() {
        this.c = -1L;
        this.d = agzi.emptyProtobufList();
        this.f = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aeps.g) == null) {
                    synchronized (aeps.class) {
                        if (aeps.g == null) {
                            aeps.g = (ahbe)new agzb((agzi)aeps.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aeps.a;
            }
            case 4: {
                return new agza((agzi)aeps.a);
            }
            case 3: {
                return new aeps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeps.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u0016", new Object[] { "b", "c", "d", aepr.class, "e", "f" });
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
