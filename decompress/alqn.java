import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqn extends ahcz implements aheo
{
    public static final alqn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqn.class, a = new alqn());
    }
    
    private alqn() {
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
                if ((b = alqn.b) == null) {
                    synchronized (alqn.class) {
                        if (alqn.b == null) {
                            alqn.b = (ahev)new ahcs((ahcz)alqn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqn.a;
            }
            case 4: {
                return new ahcr((ahcz)alqn.a);
            }
            case 3: {
                return new alqn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqn.a, "\u0001\u0000", null);
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
