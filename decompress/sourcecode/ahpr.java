import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpr extends agzi implements ahax
{
    public static final ahpr a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahpr.class, a = new ahpr());
    }
    
    private ahpr() {
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
                if ((c = ahpr.c) == null) {
                    synchronized (ahpr.class) {
                        if (ahpr.c == null) {
                            ahpr.c = (ahbe)new agzb((agzi)ahpr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahpr.a;
            }
            case 4: {
                return new agza((agzi)ahpr.a);
            }
            case 3: {
                return new ahpr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahng.g });
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
