import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqap extends agzi implements ahax
{
    public static final aqap a;
    private static volatile ahbe e;
    public int b;
    public ahca c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aqap.class, a = new aqap());
    }
    
    private aqap() {
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
                if ((e = aqap.e) == null) {
                    synchronized (aqap.class) {
                        if (aqap.e == null) {
                            aqap.e = (ahbe)new agzb((agzi)aqap.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqap.a;
            }
            case 4: {
                return new agza((agzi)aqap.a);
            }
            case 3: {
                return new aqap();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqap.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0001\u0002\u1009\u0000", new Object[] { "b", "d", "c" });
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
