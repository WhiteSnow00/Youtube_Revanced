import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpr extends agzi implements ahax
{
    public static final lpr a;
    private static volatile ahbe g;
    public int b;
    public lov c;
    public agyc d;
    public long e;
    public lpn f;
    
    static {
        agzi.registerDefaultInstance(lpr.class, a = new lpr());
    }
    
    private lpr() {
        this.d = agyc.b;
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
                if ((g = lpr.g) == null) {
                    synchronized (lpr.class) {
                        if (lpr.g == null) {
                            lpr.g = (ahbe)new agzb((agzi)lpr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return lpr.a;
            }
            case 4: {
                return new agza((agzi)lpr.a);
            }
            case 3: {
                return new lpr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpr.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u100a\u0001\u0004\u1002\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
