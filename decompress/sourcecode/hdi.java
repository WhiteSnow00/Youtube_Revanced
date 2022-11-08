import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdi extends agzi implements ahax
{
    public static final hdi a;
    private static volatile ahbe d;
    public boolean b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(hdi.class, a = new hdi());
    }
    
    private hdi() {
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
                if ((d = hdi.d) == null) {
                    synchronized (hdi.class) {
                        if (hdi.d == null) {
                            hdi.d = (ahbe)new agzb((agzi)hdi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return hdi.a;
            }
            case 4: {
                return new agza((agzi)hdi.a);
            }
            case 3: {
                return new hdi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)hdi.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003\f", new Object[] { "b", "c" });
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
