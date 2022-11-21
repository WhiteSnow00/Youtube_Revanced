import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicy extends ahcz implements aheo
{
    public static final aicy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aicy.class, a = new aicy());
    }
    
    private aicy() {
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
                if ((b = aicy.b) == null) {
                    synchronized (aicy.class) {
                        if (aicy.b == null) {
                            aicy.b = (ahev)new ahcs((ahcz)aicy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicy.a;
            }
            case 4: {
                return new ahcr((ahcz)aicy.a);
            }
            case 3: {
                return new aicy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicy.a, "\u0001\u0000", null);
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
