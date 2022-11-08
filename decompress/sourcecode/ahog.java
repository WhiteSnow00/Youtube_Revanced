import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahog extends agzi implements ahax
{
    public static final ahog a;
    private static volatile ahbe e;
    public int b;
    public ahof c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahog.class, a = new ahog());
    }
    
    private ahog() {
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
                if ((e = ahog.e) == null) {
                    synchronized (ahog.class) {
                        if (ahog.e == null) {
                            ahog.e = (ahbe)new agzb((agzi)ahog.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahog.a;
            }
            case 4: {
                return new agza((agzi)ahog.a);
            }
            case 3: {
                return new ahog();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahog.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0000\u0003\u100c\u0001", new Object[] { "b", "c", "d", ahng.a });
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
