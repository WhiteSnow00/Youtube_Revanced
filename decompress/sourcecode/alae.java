import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alae extends agzi implements ahax
{
    public static final alae a;
    private static volatile ahbe c;
    public aorx b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)alae.class, (agzi)(a = new alae()));
    }
    
    private alae() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = alae.c) == null) {
                    synchronized (alae.class) {
                        if (alae.c == null) {
                            alae.c = (ahbe)new agzb((agzi)alae.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alae.a;
            }
            case 4: {
                return new agza((agzi)alae.a);
            }
            case 3: {
                return new alae();
            }
            case 2: {
                return newMessageInfo((MessageLite)alae.a, "\u0001\u0001\u0000\u0001\uec98\u218a\uec98\u218a\u0001\u0000\u0000\u0000\uec98\u218a\u1009\u0000", new Object[] { "d", "b" });
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
