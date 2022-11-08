import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrd extends agzi implements ahax
{
    public static final ahrd a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahrd.class, a = new ahrd());
    }
    
    private ahrd() {
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
                if ((d = ahrd.d) == null) {
                    synchronized (ahrd.class) {
                        if (ahrd.d == null) {
                            ahrd.d = (ahbe)new agzb((agzi)ahrd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahrd.a;
            }
            case 4: {
                return new agza((agzi)ahrd.a);
            }
            case 3: {
                return new ahrd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrd.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u1007\u0003", new Object[] { "e", "b", "c" });
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
