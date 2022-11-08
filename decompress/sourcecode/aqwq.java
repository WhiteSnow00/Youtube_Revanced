import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwq extends agzi implements ahax
{
    public static final aqwq a;
    private static volatile ahbe d;
    public int b;
    public aqvj c;
    
    static {
        agzi.registerDefaultInstance(aqwq.class, a = new aqwq());
    }
    
    private aqwq() {
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
                if ((d = aqwq.d) == null) {
                    synchronized (aqwq.class) {
                        if (aqwq.d == null) {
                            aqwq.d = (ahbe)new agzb((agzi)aqwq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqwq.a;
            }
            case 4: {
                return new agza((agzi)aqwq.a);
            }
            case 3: {
                return new aqwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
