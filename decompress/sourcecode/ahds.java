import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahds extends agzi implements ahax
{
    public static final ahds a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public float d;
    
    static {
        agzi.registerDefaultInstance(ahds.class, a = new ahds());
    }
    
    private ahds() {
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
                if ((e = ahds.e) == null) {
                    synchronized (ahds.class) {
                        if (ahds.e == null) {
                            ahds.e = (ahbe)new agzb((agzi)ahds.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahds.a;
            }
            case 4: {
                return new agza((agzi)ahds.a);
            }
            case 3: {
                return new ahds();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahds.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
