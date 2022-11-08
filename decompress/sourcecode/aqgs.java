import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgs extends agzi implements ahax
{
    public static final aqgs a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public aqgt d;
    
    static {
        final aqgs a2 = new aqgs();
        agzi.registerDefaultInstance((Class)aqgs.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcz.a, (Object)a2, (MessageLite)a2, (agzn)null, 351816584, ahcm.k, (Class)aqgs.class);
    }
    
    private aqgs() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqgs.e) == null) {
                    synchronized (aqgs.class) {
                        if (aqgs.e == null) {
                            aqgs.e = (ahbe)new agzb((agzi)aqgs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqgs.a;
            }
            case 4: {
                return new agza((agzi)aqgs.a);
            }
            case 3: {
                return new aqgs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0001", new Object[] { "c", "d" });
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
