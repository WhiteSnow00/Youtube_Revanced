import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvs extends agzi implements ahax
{
    public static final aqvs a;
    private static volatile ahbe d;
    public int b;
    public aqvj c;
    
    static {
        agzi.registerDefaultInstance(aqvs.class, a = new aqvs());
    }
    
    private aqvs() {
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
                if ((d = aqvs.d) == null) {
                    synchronized (aqvs.class) {
                        if (aqvs.d == null) {
                            aqvs.d = (ahbe)new agzb((agzi)aqvs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqvs.a;
            }
            case 4: {
                return new agza((agzi)aqvs.a);
            }
            case 3: {
                return new aqvs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
