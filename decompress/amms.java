import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amms extends ahcz implements aheo
{
    public static final amms a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amms.class, a = new amms());
    }
    
    private amms() {
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
                if ((b = amms.b) == null) {
                    synchronized (amms.class) {
                        if (amms.b == null) {
                            amms.b = (ahev)new ahcs((ahcz)amms.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amms.a;
            }
            case 4: {
                return new ahcr((ahcz)amms.a);
            }
            case 3: {
                return new amms();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amms.a, "\u0001\u0000", null);
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
