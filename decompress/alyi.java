import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyi extends ahcz implements aheo
{
    public static final alyi a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alyi.class, a = new alyi());
    }
    
    private alyi() {
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
                if ((b = alyi.b) == null) {
                    synchronized (alyi.class) {
                        if (alyi.b == null) {
                            alyi.b = (ahev)new ahcs((ahcz)alyi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alyi.a;
            }
            case 4: {
                return new ahcr((ahcz)alyi.a);
            }
            case 3: {
                return new alyi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyi.a, "\u0001\u0000", null);
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
