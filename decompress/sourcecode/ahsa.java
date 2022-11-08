import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsa extends agzi implements ahax
{
    public static final ahsa a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahsa.class, a = new ahsa());
    }
    
    private ahsa() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahsa.c) == null) {
                    synchronized (ahsa.class) {
                        if (ahsa.c == null) {
                            ahsa.c = (ahbe)new agzb((agzi)ahsa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahsa.a;
            }
            case 4: {
                return new agza((agzi)ahsa.a);
            }
            case 3: {
                return new ahsa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
