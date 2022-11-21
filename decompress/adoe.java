import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoe extends ahcz implements aheo
{
    public static final adoe a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(adoe.class, a = new adoe());
    }
    
    private adoe() {
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
                if ((c = adoe.c) == null) {
                    synchronized (adoe.class) {
                        if (adoe.c == null) {
                            adoe.c = (ahev)new ahcs((ahcz)adoe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return adoe.a;
            }
            case 4: {
                return new ahcr((ahcz)adoe.a);
            }
            case 3: {
                return new adoe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adoe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
