import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahry extends agzi implements ahax
{
    public static final ahry a;
    private static volatile ahbe f;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(ahry.class, a = new ahry());
    }
    
    private ahry() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahry.f) == null) {
                    synchronized (ahry.class) {
                        if (ahry.f == null) {
                            ahry.f = (ahbe)new agzb((agzi)ahry.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahry.a;
            }
            case 4: {
                return new agza((agzi)ahry.a);
            }
            case 3: {
                return new ahry();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahry.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1002\u0004", new Object[] { "g", "b", "c", "d", "e" });
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
