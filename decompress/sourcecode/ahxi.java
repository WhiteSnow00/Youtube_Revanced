import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxi extends agzi implements ahax
{
    public static final ahxi a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ahxi.class, a = new ahxi());
    }
    
    private ahxi() {
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
                if ((g = ahxi.g) == null) {
                    synchronized (ahxi.class) {
                        if (ahxi.g == null) {
                            ahxi.g = (ahbe)new agzb((agzi)ahxi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahxi.a;
            }
            case 4: {
                return new agza((agzi)ahxi.a);
            }
            case 3: {
                return new ahxi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxi.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
