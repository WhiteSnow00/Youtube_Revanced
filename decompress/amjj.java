import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjj extends ahcz implements aheo
{
    public static final amjj a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(amjj.class, a = new amjj());
    }
    
    private amjj() {
        this.b = ahcz.emptyProtobufList();
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
                if ((c = amjj.c) == null) {
                    synchronized (amjj.class) {
                        if (amjj.c == null) {
                            amjj.c = (ahev)new ahcs((ahcz)amjj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjj.a;
            }
            case 4: {
                return new ahcr((ahcz)amjj.a);
            }
            case 3: {
                return new amjj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjj.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", amji.class });
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
