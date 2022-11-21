import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgx extends ahcz implements aheo
{
    public static final aqgx a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aqgx.class, a = new aqgx());
    }
    
    private aqgx() {
        this.b = 0;
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
                if ((d = aqgx.d) == null) {
                    synchronized (aqgx.class) {
                        if (aqgx.d == null) {
                            aqgx.d = (ahev)new ahcs((ahcz)aqgx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqgx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqgx.a);
            }
            case 3: {
                return new aqgx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqgx.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u103c\u0000", new Object[] { "c", "b", aqdx.g, aqgw.class });
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
