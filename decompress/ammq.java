import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammq extends ahcz implements aheo
{
    public static final ammq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ammq.class, a = new ammq());
    }
    
    private ammq() {
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
                if ((b = ammq.b) == null) {
                    synchronized (ammq.class) {
                        if (ammq.b == null) {
                            ammq.b = (ahev)new ahcs((ahcz)ammq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ammq.a;
            }
            case 4: {
                return new ahcr((ahcz)ammq.a);
            }
            case 3: {
                return new ammq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammq.a, "\u0001\u0000", null);
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
