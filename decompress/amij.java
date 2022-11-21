import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amij extends ahcz implements aheo
{
    public static final amij a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amij.class, a = new amij());
    }
    
    private amij() {
        emptyProtobufList();
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
                if ((b = amij.b) == null) {
                    synchronized (amij.class) {
                        if (amij.b == null) {
                            amij.b = (ahev)new ahcs((ahcz)amij.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amij.a;
            }
            case 4: {
                return new ahcr((ahcz)amij.a);
            }
            case 3: {
                return new amij();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amij.a, "\u0001\u0000", null);
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
