import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoof extends ahcz implements aheo
{
    public static final aoof a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aoof.class, a = new aoof());
    }
    
    private aoof() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aoof.b) == null) {
                    synchronized (aoof.class) {
                        if (aoof.b == null) {
                            aoof.b = (ahev)new ahcs((ahcz)aoof.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoof.a;
            }
            case 4: {
                return new ahcr((ahcz)aoof.a);
            }
            case 3: {
                return new aoof();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoof.a, "\u0001\u0000", null);
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
