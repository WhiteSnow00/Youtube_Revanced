import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvt extends agzi implements ahax
{
    public static final aqvt a;
    private static volatile ahbe e;
    public int b;
    public aqvj c;
    public aqvu d;
    
    static {
        agzi.registerDefaultInstance(aqvt.class, a = new aqvt());
    }
    
    private aqvt() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqvt.e) == null) {
                    synchronized (aqvt.class) {
                        if (aqvt.e == null) {
                            aqvt.e = (ahbe)new agzb((agzi)aqvt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvt.a;
            }
            case 4: {
                return new agza((agzi)aqvt.a);
            }
            case 3: {
                return new aqvt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
