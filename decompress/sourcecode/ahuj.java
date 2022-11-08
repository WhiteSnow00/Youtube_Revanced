import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuj extends agzi implements ahax
{
    public static final ahuj a;
    private static volatile ahbe g;
    public float b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        agzi.registerDefaultInstance(ahuj.class, a = new ahuj());
    }
    
    private ahuj() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahuj.g) == null) {
                    synchronized (ahuj.class) {
                        if (ahuj.g == null) {
                            ahuj.g = (ahbe)new agzb((agzi)ahuj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahuj.a;
            }
            case 4: {
                return new agza((agzi)ahuj.a);
            }
            case 3: {
                return new ahuj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuj.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1007\u0001\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "h", "b", "c", "d", "e", "f" });
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
