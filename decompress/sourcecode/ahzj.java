import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzj extends agzi implements ahax
{
    public static final ahzj a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahzj.class, a = new ahzj());
    }
    
    private ahzj() {
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
                if ((d = ahzj.d) == null) {
                    synchronized (ahzj.class) {
                        if (ahzj.d == null) {
                            ahzj.d = (ahbe)new agzb((agzi)ahzj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahzj.a;
            }
            case 4: {
                return new agza((agzi)ahzj.a);
            }
            case 3: {
                return new ahzj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ahzk.d });
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
