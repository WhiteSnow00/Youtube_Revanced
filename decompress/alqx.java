import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqx extends ahcz implements aheo
{
    public static final alqx a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqx.class, a = new alqx());
    }
    
    private alqx() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alqx.b) == null) {
                    synchronized (alqx.class) {
                        if (alqx.b == null) {
                            alqx.b = (ahev)new ahcs((ahcz)alqx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqx.a;
            }
            case 4: {
                return new ahcr((ahcz)alqx.a);
            }
            case 3: {
                return new alqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqx.a, "\u0001\u0000", null);
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
