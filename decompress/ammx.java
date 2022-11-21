import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammx extends ahcz implements aheo
{
    public static final ammx a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ammx.class, a = new ammx());
    }
    
    private ammx() {
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
                if ((c = ammx.c) == null) {
                    synchronized (ammx.class) {
                        if (ammx.c == null) {
                            ammx.c = (ahev)new ahcs((ahcz)ammx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ammx.a;
            }
            case 4: {
                return new ahcr((ahcz)ammx.a);
            }
            case 3: {
                return new ammx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amgw.u });
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
