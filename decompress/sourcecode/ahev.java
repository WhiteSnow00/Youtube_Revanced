import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahev extends agzi implements ahax
{
    public static final ahev a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(ahev.class, a = new ahev());
    }
    
    private ahev() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahev.e) == null) {
                    synchronized (ahev.class) {
                        if (ahev.e == null) {
                            ahev.e = (ahbe)new agzb((agzi)ahev.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahev.a;
            }
            case 4: {
                return new agza((agzi)ahev.a);
            }
            case 3: {
                return new ahev();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahev.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
