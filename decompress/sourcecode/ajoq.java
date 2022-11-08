import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoq extends agzi implements ahax
{
    public static final ajoq a;
    private static volatile ahbe e;
    public long b;
    public long c;
    public float d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)ajoq.class, (agzi)(a = new ajoq()));
    }
    
    private ajoq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajoq.e) == null) {
                    synchronized (ajoq.class) {
                        if (ajoq.e == null) {
                            ajoq.e = (ahbe)new agzb((agzi)ajoq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajoq.a;
            }
            case 4: {
                return new agza((agzi)ajoq.a);
            }
            case 3: {
                return new ajoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1003\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
