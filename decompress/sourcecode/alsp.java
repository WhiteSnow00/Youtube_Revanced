import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsp extends agzi implements ahax
{
    public static final alsp a;
    private static volatile ahbe g;
    public int b;
    public apsh c;
    public apsg d;
    public aixv e;
    public anso f;
    
    static {
        agzi.registerDefaultInstance(alsp.class, a = new alsp());
    }
    
    private alsp() {
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
                if ((g = alsp.g) == null) {
                    synchronized (alsp.class) {
                        if (alsp.g == null) {
                            alsp.g = (ahbe)new agzb((agzi)alsp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alsp.a;
            }
            case 4: {
                return new agza((agzi)alsp.a);
            }
            case 3: {
                return new alsp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsp.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
