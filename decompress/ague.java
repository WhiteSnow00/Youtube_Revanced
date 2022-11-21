import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ague extends ahcz implements aheo
{
    public static final ague a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ague.class, a = new ague());
    }
    
    private ague() {
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
                if ((b = ague.b) == null) {
                    synchronized (ague.class) {
                        if (ague.b == null) {
                            ague.b = (ahev)new ahcs((ahcz)ague.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ague.a;
            }
            case 4: {
                return new ahcr((ahcz)ague.a);
            }
            case 3: {
                return new ague();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ague.a, "\u0001\u0000", null);
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
