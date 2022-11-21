import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appc extends ahcz implements aheo
{
    public static final appc a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(appc.class, a = new appc());
    }
    
    private appc() {
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
                if ((c = appc.c) == null) {
                    synchronized (appc.class) {
                        if (appc.c == null) {
                            appc.c = (ahev)new ahcs((ahcz)appc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return appc.a;
            }
            case 4: {
                return new ahcr((byte[])null, (int[])null);
            }
            case 3: {
                return new appc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", appb.class });
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
