import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyw extends agzi implements ahax
{
    public static final akyw a;
    private static volatile ahbe c;
    public akza b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)akyw.class, (agzi)(a = new akyw()));
    }
    
    private akyw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = akyw.c) == null) {
                    synchronized (akyw.class) {
                        if (akyw.c == null) {
                            akyw.c = (ahbe)new agzb((agzi)akyw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akyw.a;
            }
            case 4: {
                return new agza((agzi)akyw.a);
            }
            case 3: {
                return new akyw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyw.a, "\u0001\u0001\u0000\u0001\uf1b0\u2a53\uf1b0\u2a53\u0001\u0000\u0000\u0000\uf1b0\u2a53\u1009\u0000", new Object[] { "d", "b" });
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
