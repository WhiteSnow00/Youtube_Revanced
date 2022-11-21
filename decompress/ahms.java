import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahms extends ahcz implements aheo
{
    public static final ahms a;
    private static volatile ahev c;
    public float b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahms.class, a = new ahms());
    }
    
    private ahms() {
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
                if ((c = ahms.c) == null) {
                    synchronized (ahms.class) {
                        if (ahms.c == null) {
                            ahms.c = (ahev)new ahcs((ahcz)ahms.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahms.a;
            }
            case 4: {
                return new ahcr((ahcz)ahms.a);
            }
            case 3: {
                return new ahms();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahms.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0000", new Object[] { "d", "b" });
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
