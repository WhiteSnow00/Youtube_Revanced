import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apib extends ahcz implements aheo
{
    public static final apib a;
    private static volatile ahev c;
    public ahej b;
    
    static {
        ahcz.registerDefaultInstance(apib.class, a = new apib());
    }
    
    private apib() {
        this.b = ahej.a;
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
                if ((c = apib.c) == null) {
                    synchronized (apib.class) {
                        if (apib.c == null) {
                            apib.c = (ahev)new ahcs((ahcz)apib.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apib.a;
            }
            case 4: {
                return new ahcr((ahcz)apib.a);
            }
            case 3: {
                return new apib();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apib.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[] { "b", apia.a });
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
