import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaj extends agzi implements ahax
{
    public static final alaj a;
    private static volatile ahbe e;
    public int b;
    public akru c;
    public alai d;
    
    static {
        agzi.registerDefaultInstance((Class)alaj.class, (agzi)(a = new alaj()));
    }
    
    private alaj() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = alaj.e) == null) {
                    synchronized (alaj.class) {
                        if (alaj.e == null) {
                            alaj.e = (ahbe)new agzb((agzi)alaj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alaj.a;
            }
            case 4: {
                return new agza((agzi)alaj.a);
            }
            case 3: {
                return new alaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaj.a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003\u1009\u0002\u0006\u1009\u0005", new Object[] { "b", "c", "d" });
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
