import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivq extends agzi implements ahax
{
    public static final aivq a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aivq.class, a = new aivq());
    }
    
    private aivq() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aivq.c) == null) {
                    synchronized (aivq.class) {
                        if (aivq.c == null) {
                            aivq.c = (ahbe)new agzb((agzi)aivq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aivq.a;
            }
            case 4: {
                return new agza((agzi)aivq.a);
            }
            case 3: {
                return new aivq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1002\u0001", new Object[] { "d", "b" });
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
