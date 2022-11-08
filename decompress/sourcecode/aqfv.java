import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfv extends agzi implements ahax
{
    public static final aqfv a;
    private static volatile ahbe d;
    public int b;
    public albh c;
    
    static {
        agzi.registerDefaultInstance((Class)aqfv.class, (agzi)(a = new aqfv()));
    }
    
    private aqfv() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqfv.d) == null) {
                    synchronized (aqfv.class) {
                        if (aqfv.d == null) {
                            aqfv.d = (ahbe)new agzb((agzi)aqfv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfv.a;
            }
            case 4: {
                return new agza((agzi)aqfv.a);
            }
            case 3: {
                return new aqfv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
