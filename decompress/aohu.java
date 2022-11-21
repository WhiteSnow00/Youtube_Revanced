import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohu extends ahcz implements aheo
{
    public static final aohu a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aohu.class, a = new aohu());
    }
    
    private aohu() {
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
                if ((b = aohu.b) == null) {
                    synchronized (aohu.class) {
                        if (aohu.b == null) {
                            aohu.b = (ahev)new ahcs((ahcz)aohu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohu.a;
            }
            case 4: {
                return new ahcr((ahcz)aohu.a);
            }
            case 3: {
                return new aohu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohu.a, "\u0001\u0000", null);
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
