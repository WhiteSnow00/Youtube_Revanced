import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpj extends ahcz implements aheo
{
    public static final alpj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alpj.class, a = new alpj());
    }
    
    private alpj() {
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
                if ((b = alpj.b) == null) {
                    synchronized (alpj.class) {
                        if (alpj.b == null) {
                            alpj.b = (ahev)new ahcs((ahcz)alpj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpj.a;
            }
            case 4: {
                return new ahcr((ahcz)alpj.a);
            }
            case 3: {
                return new alpj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpj.a, "\u0001\u0000", null);
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
