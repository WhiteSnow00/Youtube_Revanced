import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfi extends agzi implements ahax
{
    public static final ajfi a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ajfi.class, a = new ajfi());
    }
    
    private ajfi() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajfi.d) == null) {
                    synchronized (ajfi.class) {
                        if (ajfi.d == null) {
                            ajfi.d = (ahbe)new agzb((agzi)ajfi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfi.a;
            }
            case 4: {
                return new agza((agzi)ajfi.a);
            }
            case 3: {
                return new ajfi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ajcg.l });
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
