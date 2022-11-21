import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjr extends ahcz implements aheo
{
    public static final amjr a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(amjr.class, a = new amjr());
    }
    
    private amjr() {
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
                if ((c = amjr.c) == null) {
                    synchronized (amjr.class) {
                        if (amjr.c == null) {
                            amjr.c = (ahev)new ahcs((ahcz)amjr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjr.a;
            }
            case 4: {
                return new ahcr((ahcz)amjr.a);
            }
            case 3: {
                return new amjr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akfi.a() });
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
