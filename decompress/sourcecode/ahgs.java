import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgs extends agzi implements ahax
{
    public static final ahgs a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(ahgs.class, a = new ahgs());
    }
    
    private ahgs() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahgs.g) == null) {
                    synchronized (ahgs.class) {
                        if (ahgs.g == null) {
                            ahgs.g = (ahbe)new agzb((agzi)ahgs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahgs.a;
            }
            case 4: {
                return new agza((agzi)ahgs.a);
            }
            case 3: {
                return new ahgs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgs.a, "\u0001\u0004\u0000\u0001\u0006\r\u0004\u0000\u0000\u0000\u0006\u1004\u0004\n\u1007\u0007\u000b\u1007\b\r\u1007\n", new Object[] { "b", "c", "d", "e", "f" });
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
