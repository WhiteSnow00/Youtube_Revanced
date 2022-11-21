import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopa extends ahcz implements aheo
{
    public static final aopa a;
    private static volatile ahev c;
    public float b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aopa.class, a = new aopa());
    }
    
    private aopa() {
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
                if ((c = aopa.c) == null) {
                    synchronized (aopa.class) {
                        if (aopa.c == null) {
                            aopa.c = (ahev)new ahcs((ahcz)aopa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aopa.a;
            }
            case 4: {
                return new ahcr((ahcz)aopa.a);
            }
            case 3: {
                return new aopa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopa.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0001", new Object[] { "d", "b" });
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
