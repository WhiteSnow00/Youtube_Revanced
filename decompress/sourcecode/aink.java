import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aink extends agzi implements ahax
{
    public static final aink a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aink.class, a = new aink());
    }
    
    private aink() {
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
                if ((c = aink.c) == null) {
                    synchronized (aink.class) {
                        if (aink.c == null) {
                            aink.c = (ahbe)new agzb((agzi)aink.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aink.a;
            }
            case 4: {
                return new agza((agzi)aink.a);
            }
            case 3: {
                return new aink();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aink.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
