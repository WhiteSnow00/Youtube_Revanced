import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpm extends agzi implements ahax
{
    public static final ajpm a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public float d;
    public int e;
    public float f;
    
    static {
        agzi.registerDefaultInstance((Class)ajpm.class, (agzi)(a = new ajpm()));
    }
    
    private ajpm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ajpm.g) == null) {
                    synchronized (ajpm.class) {
                        if (ajpm.g == null) {
                            ajpm.g = (ahbe)new agzb((agzi)ajpm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajpm.a;
            }
            case 4: {
                return new agza((agzi)ajpm.a);
            }
            case 3: {
                return new ajpm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpm.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1004\u0002\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
