import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahio extends agzi implements ahax
{
    public static final ahio a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahio.class, a = new ahio());
    }
    
    private ahio() {
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
                if ((c = ahio.c) == null) {
                    synchronized (ahio.class) {
                        if (ahio.c == null) {
                            ahio.c = (ahbe)new agzb((agzi)ahio.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahio.a;
            }
            case 4: {
                return new agza((agzi)ahio.a);
            }
            case 3: {
                return new ahio();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahio.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
