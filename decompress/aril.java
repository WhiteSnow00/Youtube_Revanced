import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aril extends ahcz implements aheo
{
    public static final aril a;
    private static volatile ahev c;
    public ahfq b;
    
    static {
        ahcz.registerDefaultInstance(aril.class, a = new aril());
    }
    
    private aril() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aril.c) == null) {
                    synchronized (aril.class) {
                        if (aril.c == null) {
                            aril.c = (ahev)new ahcs((ahcz)aril.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aril.a;
            }
            case 4: {
                return new ahcr((ahcz)aril.a);
            }
            case 3: {
                return new aril();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aril.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "b" });
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
