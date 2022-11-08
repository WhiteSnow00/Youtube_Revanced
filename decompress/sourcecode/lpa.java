import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpa extends agzi implements ahax
{
    public static final lpa a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public loz f;
    
    static {
        agzi.registerDefaultInstance(lpa.class, a = new lpa());
    }
    
    private lpa() {
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
                if ((g = lpa.g) == null) {
                    synchronized (lpa.class) {
                        if (lpa.g == null) {
                            lpa.g = (ahbe)new agzb((agzi)lpa.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return lpa.a;
            }
            case 4: {
                return new agza((agzi)lpa.a);
            }
            case 3: {
                return new lpa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpa.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1009\u0003", new Object[] { "b", "c", ahft.a(), "d", "e", "f" });
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
