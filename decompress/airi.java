import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airi extends ahcz implements aheo
{
    public static final airi a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(airi.class, a = new airi());
    }
    
    private airi() {
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
                if ((c = airi.c) == null) {
                    synchronized (airi.class) {
                        if (airi.c == null) {
                            airi.c = (ahev)new ahcs((ahcz)airi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return airi.a;
            }
            case 4: {
                return new ahcr((ahcz)airi.a);
            }
            case 3: {
                return new airi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
