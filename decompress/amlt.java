import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amlt extends ahcz implements aheo
{
    public static final amlt a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amlt.class, a = new amlt());
    }
    
    private amlt() {
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
                if ((b = amlt.b) == null) {
                    synchronized (amlt.class) {
                        if (amlt.b == null) {
                            amlt.b = (ahev)new ahcs((ahcz)amlt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amlt.a;
            }
            case 4: {
                return new ahcr((ahcz)amlt.a);
            }
            case 3: {
                return new amlt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlt.a, "\u0001\u0000", null);
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
