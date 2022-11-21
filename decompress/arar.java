import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arar extends ahcz implements aheo
{
    public static final arar a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arar.class, a = new arar());
    }
    
    private arar() {
        final ahbt b = ahbt.b;
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
                if ((b = arar.b) == null) {
                    synchronized (arar.class) {
                        if (arar.b == null) {
                            arar.b = (ahev)new ahcs((ahcz)arar.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arar.a;
            }
            case 4: {
                return new ahcr((ahcz)arar.a);
            }
            case 3: {
                return new arar();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arar.a, "\u0001\u0000", null);
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
