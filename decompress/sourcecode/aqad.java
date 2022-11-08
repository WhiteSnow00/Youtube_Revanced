import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqad extends agzi implements ahax
{
    public static final aqad a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aqad.class, a = new aqad());
    }
    
    private aqad() {
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
                if ((c = aqad.c) == null) {
                    synchronized (aqad.class) {
                        if (aqad.c == null) {
                            aqad.c = (ahbe)new agzb((agzi)aqad.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqad.a;
            }
            case 4: {
                return new agza((agzi)aqad.a);
            }
            case 3: {
                return new aqad();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqad.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
