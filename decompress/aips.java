import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aips extends ahcz implements aheo
{
    public static final aips a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aips.class, a = new aips());
    }
    
    private aips() {
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
                if ((b = aips.b) == null) {
                    synchronized (aips.class) {
                        if (aips.b == null) {
                            aips.b = (ahev)new ahcs((ahcz)aips.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aips.a;
            }
            case 4: {
                return new ahcr((ahcz)aips.a);
            }
            case 3: {
                return new aips();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aips.a, "\u0001\u0000", null);
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
