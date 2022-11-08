import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwb extends agzi implements ahax
{
    public static final aqwb a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(aqwb.class, a = new aqwb());
    }
    
    private aqwb() {
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
                if ((d = aqwb.d) == null) {
                    synchronized (aqwb.class) {
                        if (aqwb.d == null) {
                            aqwb.d = (ahbe)new agzb((agzi)aqwb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqwb.a;
            }
            case 4: {
                return new agza((agzi)aqwb.a);
            }
            case 3: {
                return new aqwb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
