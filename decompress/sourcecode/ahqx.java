import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqx extends agzi implements ahax
{
    public static final ahqx a;
    private static volatile ahbe d;
    public int b;
    public ahrf c;
    
    static {
        agzi.registerDefaultInstance(ahqx.class, a = new ahqx());
    }
    
    private ahqx() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahqx.d) == null) {
                    synchronized (ahqx.class) {
                        if (ahqx.d == null) {
                            ahqx.d = (ahbe)new agzb((agzi)ahqx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahqx.a;
            }
            case 4: {
                return new agza((agzi)ahqx.a);
            }
            case 3: {
                return new ahqx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqx.a, "\u0001\u0001\u0000\u0001\ue0e9\u2122\ue0e9\u2122\u0001\u0000\u0000\u0000\ue0e9\u2122\u1009\u0000", new Object[] { "b", "c" });
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
