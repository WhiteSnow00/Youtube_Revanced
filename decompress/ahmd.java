import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmd extends ahcz implements aheo
{
    public static final ahmd a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahmd.class, a = new ahmd());
    }
    
    private ahmd() {
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
                if ((c = ahmd.c) == null) {
                    synchronized (ahmd.class) {
                        if (ahmd.c == null) {
                            ahmd.c = (ahev)new ahcs((ahcz)ahmd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmd.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmd.a);
            }
            case 3: {
                return new ahmd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
