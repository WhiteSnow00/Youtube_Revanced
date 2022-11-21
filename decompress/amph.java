import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amph extends ahcz implements aheo
{
    public static final amph a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amph.class, a = new amph());
    }
    
    private amph() {
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
                if ((b = amph.b) == null) {
                    synchronized (amph.class) {
                        if (amph.b == null) {
                            amph.b = (ahev)new ahcs((ahcz)amph.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amph.a;
            }
            case 4: {
                return new ahcr((ahcz)amph.a);
            }
            case 3: {
                return new amph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amph.a, "\u0001\u0000", null);
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
