import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqs extends agzi implements ahax
{
    public static final ahqs a;
    private static volatile ahbe d;
    public int b;
    public long c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahqs.class, a = new ahqs());
    }
    
    private ahqs() {
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
                if ((d = ahqs.d) == null) {
                    synchronized (ahqs.class) {
                        if (ahqs.d == null) {
                            ahqs.d = (ahbe)new agzb((agzi)ahqs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahqs.a;
            }
            case 4: {
                return new agza((agzi)ahqs.a);
            }
            case 3: {
                return new ahqs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "e", "b", ajbv.a(), "c" });
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
