import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhn extends agzi implements ahax
{
    public static final ahhn a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahhn.class, a = new ahhn());
    }
    
    private ahhn() {
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
                if ((e = ahhn.e) == null) {
                    synchronized (ahhn.class) {
                        if (ahhn.e == null) {
                            ahhn.e = (ahbe)new agzb((agzi)ahhn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahhn.a;
            }
            case 4: {
                return new agza((agzi)ahhn.a);
            }
            case 3: {
                return new ahhn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ahec.u, "d", ahec.t });
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
