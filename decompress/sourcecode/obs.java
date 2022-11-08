import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obs extends agzi implements ahax
{
    public static final obs a;
    private static volatile ahbe d;
    public agsd b;
    public obi c;
    
    static {
        agzi.registerDefaultInstance((Class)obs.class, (agzi)(a = new obs()));
    }
    
    private obs() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = obs.d) == null) {
                    synchronized (obs.class) {
                        if (obs.d == null) {
                            obs.d = (ahbe)new agzb((agzi)obs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obs.a;
            }
            case 4: {
                return new agza((agzi)obs.a);
            }
            case 3: {
                return new obs();
            }
            case 2: {
                return newMessageInfo((MessageLite)obs.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
