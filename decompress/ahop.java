import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahop extends ahcz implements aheo
{
    public static final ahop a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(ahop.class, a = new ahop());
    }
    
    private ahop() {
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
                if ((c = ahop.c) == null) {
                    synchronized (ahop.class) {
                        if (ahop.c == null) {
                            ahop.c = (ahev)new ahcs((ahcz)ahop.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahop.a;
            }
            case 4: {
                return new ahcr((ahcz)ahop.a);
            }
            case 3: {
                return new ahop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahop.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
