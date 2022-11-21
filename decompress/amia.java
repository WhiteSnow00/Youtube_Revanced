import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amia extends ahcz implements aheo
{
    public static final amia a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amia.class, a = new amia());
    }
    
    private amia() {
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
                if ((b = amia.b) == null) {
                    synchronized (amia.class) {
                        if (amia.b == null) {
                            amia.b = (ahev)new ahcs((ahcz)amia.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amia.a;
            }
            case 4: {
                return new ahcr((ahcz)amia.a);
            }
            case 3: {
                return new amia();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amia.a, "\u0001\u0000", null);
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
