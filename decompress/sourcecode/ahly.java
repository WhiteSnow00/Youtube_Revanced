import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahly extends agzi implements ahax
{
    public static final ahly a;
    private static volatile ahbe e;
    public int b;
    public ahlz c;
    public ahma d;
    
    static {
        agzi.registerDefaultInstance((Class)ahly.class, (agzi)(a = new ahly()));
    }
    
    private ahly() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahly.e) == null) {
                    synchronized (ahly.class) {
                        if (ahly.e == null) {
                            ahly.e = (ahbe)new agzb((agzi)ahly.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahly.a;
            }
            case 4: {
                return new agza((agzi)ahly.a);
            }
            case 3: {
                return new ahly();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahly.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
