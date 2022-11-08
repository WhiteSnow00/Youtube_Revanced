import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprq extends agzi implements ahax
{
    public static final aprq a;
    private static volatile ahbe f;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance((Class)aprq.class, (agzi)(a = new aprq()));
    }
    
    private aprq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aprq.f) == null) {
                    synchronized (aprq.class) {
                        if (aprq.f == null) {
                            aprq.f = (ahbe)new agzb((agzi)aprq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aprq.a;
            }
            case 4: {
                return new agza((agzi)aprq.a);
            }
            case 3: {
                return new aprq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprq.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\f", new Object[] { "b", "c", "d", "e" });
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
