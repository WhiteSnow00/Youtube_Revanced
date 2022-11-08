import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahef extends agzi implements ahax
{
    public static final ahef a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahef.class, a = new ahef());
    }
    
    private ahef() {
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
                if ((e = ahef.e) == null) {
                    synchronized (ahef.class) {
                        if (ahef.e == null) {
                            ahef.e = (ahbe)new agzb((agzi)ahef.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahef.a;
            }
            case 4: {
                return new agza((agzi)ahef.a);
            }
            case 3: {
                return new ahef();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahef.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[] { "b", "c", "d" });
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
