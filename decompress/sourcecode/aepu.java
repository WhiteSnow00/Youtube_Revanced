import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepu extends agzi implements ahax
{
    public static final aepu a;
    private static volatile ahbe e;
    public int b;
    public aept c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aepu.class, a = new aepu());
    }
    
    private aepu() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aepu.e) == null) {
                    synchronized (aepu.class) {
                        if (aepu.e == null) {
                            aepu.e = (ahbe)new agzb((agzi)aepu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aepu.a;
            }
            case 4: {
                return new agza((agzi)aepu.a);
            }
            case 3: {
                return new aepu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aepu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
