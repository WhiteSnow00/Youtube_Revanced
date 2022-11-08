import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqx extends agzi implements ahax
{
    public static final alqx a;
    private static volatile ahbe f;
    public int b;
    public alqy c;
    public alqw d;
    public alqw e;
    
    static {
        agzi.registerDefaultInstance(alqx.class, a = new alqx());
    }
    
    private alqx() {
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
                if ((f = alqx.f) == null) {
                    synchronized (alqx.class) {
                        if (alqx.f == null) {
                            alqx.f = (ahbe)new agzb((agzi)alqx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alqx.a;
            }
            case 4: {
                return new alqv();
            }
            case 3: {
                return new alqx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
