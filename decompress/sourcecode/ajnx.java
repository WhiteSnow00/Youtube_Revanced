import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnx extends agzi implements ahax
{
    public static final ajnx a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ajnx.class, (agzi)(a = new ajnx()));
    }
    
    private ajnx() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajnx.d) == null) {
                    synchronized (ajnx.class) {
                        if (ajnx.d == null) {
                            ajnx.d = (ahbe)new agzb((agzi)ajnx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnx.a;
            }
            case 4: {
                return new agza((agzi)ajnx.a);
            }
            case 3: {
                return new ajnx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "e", "b", ajoa.c, "c", ajkr.u });
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
