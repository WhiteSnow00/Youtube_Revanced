import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomq extends agzi implements ahax
{
    public static final aomq a;
    private static volatile ahbe d;
    public int b;
    public float c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aomq.class, (agzi)(a = new aomq()));
    }
    
    private aomq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aomq.d) == null) {
                    synchronized (aomq.class) {
                        if (aomq.d == null) {
                            aomq.d = (ahbe)new agzb((agzi)aomq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomq.a;
            }
            case 4: {
                return new agza((agzi)aomq.a);
            }
            case 3: {
                return new aomq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001", new Object[] { "e", "b", "c" });
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
