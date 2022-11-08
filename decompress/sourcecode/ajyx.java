import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyx extends agzi implements ahax
{
    public static final ajyx a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ajyx.class, a = new ajyx());
    }
    
    private ajyx() {
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
                if ((g = ajyx.g) == null) {
                    synchronized (ajyx.class) {
                        if (ajyx.g == null) {
                            ajyx.g = (ahbe)new agzb((agzi)ajyx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajyx.a;
            }
            case 4: {
                return new agza((agzi)ajyx.a);
            }
            case 3: {
                return new ajyx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
