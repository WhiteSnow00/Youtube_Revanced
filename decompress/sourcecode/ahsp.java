import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsp extends agzi implements ahax
{
    public static final ahsp a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(ahsp.class, a = new ahsp());
    }
    
    private ahsp() {
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
                if ((d = ahsp.d) == null) {
                    synchronized (ahsp.class) {
                        if (ahsp.d == null) {
                            ahsp.d = (ahbe)new agzb((agzi)ahsp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahsp.a;
            }
            case 4: {
                return new agza((agzi)ahsp.a);
            }
            case 3: {
                return new ahsp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
