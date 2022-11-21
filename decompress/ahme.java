import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahme extends ahcz implements aheo
{
    public static final ahme a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ahme.class, a = new ahme());
    }
    
    private ahme() {
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
                if ((b = ahme.b) == null) {
                    synchronized (ahme.class) {
                        if (ahme.b == null) {
                            ahme.b = (ahev)new ahcs((ahcz)ahme.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahme.a;
            }
            case 4: {
                return new ahcr((ahcz)ahme.a);
            }
            case 3: {
                return new ahme();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahme.a, "\u0001\u0000", null);
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
