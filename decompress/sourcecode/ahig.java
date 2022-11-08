import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahig extends agzi implements ahax
{
    public static final ahig a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahig.class, a = new ahig());
    }
    
    private ahig() {
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
                if ((d = ahig.d) == null) {
                    synchronized (ahig.class) {
                        if (ahig.d == null) {
                            ahig.d = (ahbe)new agzb((agzi)ahig.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahig.a;
            }
            case 4: {
                return new agza((agzi)ahig.a);
            }
            case 3: {
                return new ahig();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahig.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
