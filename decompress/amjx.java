import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjx extends ahcz implements aheo
{
    public static final amjx a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(amjx.class, a = new amjx());
    }
    
    private amjx() {
        this.b = "";
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
                if ((c = amjx.c) == null) {
                    synchronized (amjx.class) {
                        if (amjx.c == null) {
                            amjx.c = (ahev)new ahcs((ahcz)amjx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjx.a;
            }
            case 4: {
                return new ahcr((ahcz)amjx.a);
            }
            case 3: {
                return new amjx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjx.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0002", new Object[] { "d", "b" });
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
