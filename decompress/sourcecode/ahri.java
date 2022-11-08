import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahri extends agzi implements ahax
{
    public static final ahri a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahri.class, a = new ahri());
    }
    
    private ahri() {
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
                if ((c = ahri.c) == null) {
                    synchronized (ahri.class) {
                        if (ahri.c == null) {
                            ahri.c = (ahbe)new agzb((agzi)ahri.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahri.a;
            }
            case 4: {
                return new agza((agzi)ahri.a);
            }
            case 3: {
                return new ahri();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahri.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahrh.a() });
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
