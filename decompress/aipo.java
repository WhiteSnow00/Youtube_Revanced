import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipo extends ahcz implements aheo
{
    public static final aipo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipo.class, a = new aipo());
    }
    
    private aipo() {
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
                if ((b = aipo.b) == null) {
                    synchronized (aipo.class) {
                        if (aipo.b == null) {
                            aipo.b = (ahev)new ahcs((ahcz)aipo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipo.a;
            }
            case 4: {
                return new ahcr((ahcz)aipo.a);
            }
            case 3: {
                return new aipo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipo.a, "\u0001\u0000", null);
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
