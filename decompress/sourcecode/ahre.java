import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahre extends agzi implements ahax
{
    public static final ahre a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ahre.class, a = new ahre());
    }
    
    private ahre() {
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
                if ((d = ahre.d) == null) {
                    synchronized (ahre.class) {
                        if (ahre.d == null) {
                            ahre.d = (ahbe)new agzb((agzi)ahre.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahre.a;
            }
            case 4: {
                return new agza((agzi)ahre.a);
            }
            case 3: {
                return new ahre();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahre.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0000", new Object[] { "b", "c" });
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
