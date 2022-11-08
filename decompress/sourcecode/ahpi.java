import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpi extends agzi implements ahax
{
    public static final ahpi a;
    private static volatile ahbe f;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(ahpi.class, a = new ahpi());
    }
    
    private ahpi() {
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
                if ((f = ahpi.f) == null) {
                    synchronized (ahpi.class) {
                        if (ahpi.f == null) {
                            ahpi.f = (ahbe)new agzb((agzi)ahpi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahpi.a;
            }
            case 4: {
                return new agza((agzi)ahpi.a);
            }
            case 3: {
                return new ahpi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpi.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
