import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvd extends agzi implements ahax
{
    public static final aqvd a;
    private static volatile ahbe d;
    public int b;
    public aqve c;
    
    static {
        agzi.registerDefaultInstance(aqvd.class, a = new aqvd());
    }
    
    private aqvd() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqvd.d) == null) {
                    synchronized (aqvd.class) {
                        if (aqvd.d == null) {
                            aqvd.d = (ahbe)new agzb((agzi)aqvd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqvd.a;
            }
            case 4: {
                return new agza((agzi)aqvd.a);
            }
            case 3: {
                return new aqvd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
