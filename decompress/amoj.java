import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoj extends ahcz implements aheo
{
    public static final amoj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(amoj.class, a = new amoj());
    }
    
    private amoj() {
        emptyIntList();
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
                if ((b = amoj.b) == null) {
                    synchronized (amoj.class) {
                        if (amoj.b == null) {
                            amoj.b = (ahev)new ahcs((ahcz)amoj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoj.a;
            }
            case 4: {
                return new ahcr((ahcz)amoj.a);
            }
            case 3: {
                return new amoj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoj.a, "\u0001\u0000", null);
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
