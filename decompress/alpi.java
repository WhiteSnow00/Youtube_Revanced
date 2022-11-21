import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpi extends ahcz implements aheo
{
    public static final alpi a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alpi.class, a = new alpi());
    }
    
    private alpi() {
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
                if ((b = alpi.b) == null) {
                    synchronized (alpi.class) {
                        if (alpi.b == null) {
                            alpi.b = (ahev)new ahcs((ahcz)alpi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpi.a;
            }
            case 4: {
                return new ahcr((ahcz)alpi.a);
            }
            case 3: {
                return new alpi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpi.a, "\u0001\u0000", null);
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
