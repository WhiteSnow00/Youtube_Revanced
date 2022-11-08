import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahju extends agzi implements ahax
{
    public static final ahju a;
    private static volatile ahbe e;
    public int b;
    public ahlg c;
    public ahjr d;
    
    static {
        agzi.registerDefaultInstance((Class)ahju.class, (agzi)(a = new ahju()));
    }
    
    private ahju() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahju.e) == null) {
                    synchronized (ahju.class) {
                        if (ahju.e == null) {
                            ahju.e = (ahbe)new agzb((agzi)ahju.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahju.a;
            }
            case 4: {
                return new agza((agzi)ahju.a);
            }
            case 3: {
                return new ahju();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahju.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
