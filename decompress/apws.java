import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apws extends ahcz implements aheo
{
    public static final apws a;
    private static volatile ahev c;
    public int b;
    
    static {
        ahcz.registerDefaultInstance(apws.class, a = new apws());
    }
    
    private apws() {
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
                if ((c = apws.c) == null) {
                    synchronized (apws.class) {
                        if (apws.c == null) {
                            apws.c = (ahev)new ahcs((ahcz)apws.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apws.a;
            }
            case 4: {
                return new ahcr((ahcz)apws.a);
            }
            case 3: {
                return new apws();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apws.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[] { "b" });
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
