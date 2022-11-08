import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkn extends agzi implements ahax
{
    public static final adkn a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public long d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(adkn.class, a = new adkn());
    }
    
    private adkn() {
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
                if ((f = adkn.f) == null) {
                    synchronized (adkn.class) {
                        if (adkn.f == null) {
                            adkn.f = (ahbe)new agzb((agzi)adkn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return adkn.a;
            }
            case 4: {
                return new agza((agzi)adkn.a);
            }
            case 3: {
                return new adkn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adkn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
