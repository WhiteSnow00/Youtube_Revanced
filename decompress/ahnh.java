import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnh extends ahcz implements aheo
{
    public static final ahnh a;
    private static volatile ahev c;
    public ahng b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahnh.class, a = new ahnh());
    }
    
    private ahnh() {
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
                if ((c = ahnh.c) == null) {
                    synchronized (ahnh.class) {
                        if (ahnh.c == null) {
                            ahnh.c = (ahev)new ahcs((ahcz)ahnh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahnh.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnh.a);
            }
            case 3: {
                return new ahnh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
