import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdr extends agzi implements ahax
{
    public static final ahdr a;
    private static volatile ahbe f;
    public int b;
    public ahds c;
    public ahds d;
    public float e;
    
    static {
        agzi.registerDefaultInstance(ahdr.class, a = new ahdr());
    }
    
    private ahdr() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahdr.f) == null) {
                    synchronized (ahdr.class) {
                        if (ahdr.f == null) {
                            ahdr.f = (ahbe)new agzb((agzi)ahdr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahdr.a;
            }
            case 4: {
                return new agza((agzi)ahdr.a);
            }
            case 3: {
                return new ahdr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdr.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e" });
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