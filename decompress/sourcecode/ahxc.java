import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxc extends agzi implements ahax
{
    public static final ahxc a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public float d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(ahxc.class, a = new ahxc());
    }
    
    private ahxc() {
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
                if ((e = ahxc.e) == null) {
                    synchronized (ahxc.class) {
                        if (ahxc.e == null) {
                            ahxc.e = (ahbe)new agzb((agzi)ahxc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahxc.a;
            }
            case 4: {
                return new agza((agzi)ahxc.a);
            }
            case 3: {
                return new ahxc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxc.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u1004\u0002\u0004\u1001\u0003\u0005\u1001\u0004", new Object[] { "f", "b", "c", "d" });
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
