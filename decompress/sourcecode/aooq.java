import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooq extends agzi implements ahax
{
    public static final aooq a;
    private static volatile ahbe d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aooq.class, (agzi)(a = new aooq()));
    }
    
    private aooq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aooq.d) == null) {
                    synchronized (aooq.class) {
                        if (aooq.d == null) {
                            aooq.d = (ahbe)new agzb((agzi)aooq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aooq.a;
            }
            case 4: {
                return new agza((agzi)aooq.a);
            }
            case 3: {
                return new aooq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
