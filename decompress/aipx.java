import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipx extends ahcz implements aheo
{
    public static final aipx a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipx.class, a = new aipx());
    }
    
    private aipx() {
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
                if ((b = aipx.b) == null) {
                    synchronized (aipx.class) {
                        if (aipx.b == null) {
                            aipx.b = (ahev)new ahcs((ahcz)aipx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipx.a;
            }
            case 4: {
                return new ahcr((ahcz)aipx.a);
            }
            case 3: {
                return new aipx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipx.a, "\u0001\u0000", null);
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
