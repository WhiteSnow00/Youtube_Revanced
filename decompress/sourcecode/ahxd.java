import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxd extends agzi implements ahax
{
    public static final ahxd a;
    private static volatile ahbe f;
    public int b;
    public ahxg c;
    public ahxh d;
    public ahxj e;
    
    static {
        agzi.registerDefaultInstance(ahxd.class, a = new ahxd());
    }
    
    private ahxd() {
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
                if ((f = ahxd.f) == null) {
                    synchronized (ahxd.class) {
                        if (ahxd.f == null) {
                            ahxd.f = (ahbe)new agzb((agzi)ahxd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahxd.a;
            }
            case 4: {
                return new agza((agzi)ahxd.a);
            }
            case 3: {
                return new ahxd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
