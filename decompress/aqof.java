import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqof extends ahcz implements aheo
{
    public static final aqof a;
    private static volatile ahev g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    
    static {
        ahcz.registerDefaultInstance(aqof.class, a = new aqof());
    }
    
    private aqof() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqof.g) == null) {
                    synchronized (aqof.class) {
                        if (aqof.g == null) {
                            aqof.g = (ahev)new ahcs((ahcz)aqof.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqof.a;
            }
            case 4: {
                return new ahcr((ahcz)aqof.a);
            }
            case 3: {
                return new aqof();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqof.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
