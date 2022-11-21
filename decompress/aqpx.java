import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpx extends ahcz implements aheo
{
    public static final aqpx a;
    private static volatile ahev d;
    public int b;
    public double c;
    
    static {
        ahcz.registerDefaultInstance(aqpx.class, a = new aqpx());
    }
    
    private aqpx() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqpx.d) == null) {
                    synchronized (aqpx.class) {
                        if (aqpx.d == null) {
                            aqpx.d = (ahev)new ahcs((ahcz)aqpx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqpx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpx.a);
            }
            case 3: {
                return new aqpx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1000\u0000", new Object[] { "b", "c" });
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
