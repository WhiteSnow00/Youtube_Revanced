import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqw extends ahcz implements aheo
{
    public static final aiqw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aiqw.class, a = new aiqw());
    }
    
    private aiqw() {
        emptyIntList();
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
                if ((b = aiqw.b) == null) {
                    synchronized (aiqw.class) {
                        if (aiqw.b == null) {
                            aiqw.b = (ahev)new ahcs((ahcz)aiqw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiqw.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqw.a);
            }
            case 3: {
                return new aiqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqw.a, "\u0001\u0000", null);
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
