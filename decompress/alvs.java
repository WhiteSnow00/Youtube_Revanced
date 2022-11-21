import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvs extends ahcz implements aheo
{
    public static final alvs a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alvs.class, a = new alvs());
    }
    
    private alvs() {
        ahcz.emptyProtobufList();
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
                if ((b = alvs.b) == null) {
                    synchronized (alvs.class) {
                        if (alvs.b == null) {
                            alvs.b = (ahev)new ahcs((ahcz)alvs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvs.a;
            }
            case 4: {
                return new ahcr((ahcz)alvs.a);
            }
            case 3: {
                return new alvs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvs.a, "\u0001\u0000", null);
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
