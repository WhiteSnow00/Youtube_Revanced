import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqax extends agzi implements ahax
{
    public static final aqax a;
    private static volatile ahbe d;
    public int b;
    public ahca c;
    
    static {
        agzi.registerDefaultInstance(aqax.class, a = new aqax());
    }
    
    private aqax() {
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
                if ((d = aqax.d) == null) {
                    synchronized (aqax.class) {
                        if (aqax.d == null) {
                            aqax.d = (ahbe)new agzb((agzi)aqax.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqax.a;
            }
            case 4: {
                return new agza((agzi)aqax.a);
            }
            case 3: {
                return new aqax();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqax.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
