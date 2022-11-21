import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqp extends ahcz implements aheo
{
    public static final alqp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqp.class, a = new alqp());
    }
    
    private alqp() {
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
                if ((b = alqp.b) == null) {
                    synchronized (alqp.class) {
                        if (alqp.b == null) {
                            alqp.b = (ahev)new ahcs((ahcz)alqp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqp.a;
            }
            case 4: {
                return new ahcr((ahcz)alqp.a);
            }
            case 3: {
                return new alqp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqp.a, "\u0001\u0000", null);
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
