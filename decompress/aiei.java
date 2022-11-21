import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiei extends ahcz implements aheo
{
    public static final aiei a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aiei.class, a = new aiei());
    }
    
    private aiei() {
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
                if ((b = aiei.b) == null) {
                    synchronized (aiei.class) {
                        if (aiei.b == null) {
                            aiei.b = (ahev)new ahcs((ahcz)aiei.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiei.a;
            }
            case 4: {
                return new ahcr((ahcz)aiei.a);
            }
            case 3: {
                return new aiei();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiei.a, "\u0001\u0000", null);
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
