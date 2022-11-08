import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqe extends agzi implements ahax
{
    public static final ahqe a;
    private static volatile ahbe g;
    public long b;
    public long c;
    public ahqf d;
    public ahqg e;
    public ahqh f;
    private int h;
    
    static {
        agzi.registerDefaultInstance(ahqe.class, a = new ahqe());
    }
    
    private ahqe() {
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
                if ((g = ahqe.g) == null) {
                    synchronized (ahqe.class) {
                        if (ahqe.g == null) {
                            ahqe.g = (ahbe)new agzb((agzi)ahqe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahqe.a;
            }
            case 4: {
                return new agza((agzi)ahqe.a);
            }
            case 3: {
                return new ahqe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqe.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1002\u0001\u0005\u1009\u0004", new Object[] { "h", "b", "d", "e", "c", "f" });
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
