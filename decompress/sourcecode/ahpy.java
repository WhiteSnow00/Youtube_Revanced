import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpy extends agzi implements ahax
{
    public static final ahpy a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahpy.class, a = new ahpy());
    }
    
    private ahpy() {
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
                if ((c = ahpy.c) == null) {
                    synchronized (ahpy.class) {
                        if (ahpy.c == null) {
                            ahpy.c = (ahbe)new agzb((agzi)ahpy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahpy.a;
            }
            case 4: {
                return new agza((agzi)ahpy.a);
            }
            case 3: {
                return new ahpy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
