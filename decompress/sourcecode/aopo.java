import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopo extends agzi implements ahax
{
    public static final aopo a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aopo.class, (agzi)(a = new aopo()));
    }
    
    private aopo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aopo.c) == null) {
                    synchronized (aopo.class) {
                        if (aopo.c == null) {
                            aopo.c = (ahbe)new agzb((agzi)aopo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aopo.a;
            }
            case 4: {
                return new agza((agzi)aopo.a);
            }
            case 3: {
                return new aopo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
