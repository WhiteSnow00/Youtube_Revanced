import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzg extends agzi implements ahax
{
    public static final ahzg a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ahzg.class, a = new ahzg());
    }
    
    private ahzg() {
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
                if ((g = ahzg.g) == null) {
                    synchronized (ahzg.class) {
                        if (ahzg.g == null) {
                            ahzg.g = (ahbe)new agzb((agzi)ahzg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahzg.a;
            }
            case 4: {
                return new agza((agzi)ahzg.a);
            }
            case 3: {
                return new ahzg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
