import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyw extends ahcz implements aheo
{
    public static final apyw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apyw.class, a = new apyw());
    }
    
    private apyw() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apyw.b) == null) {
                    synchronized (apyw.class) {
                        if (apyw.b == null) {
                            apyw.b = (ahev)new ahcs((ahcz)apyw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyw.a;
            }
            case 4: {
                return new ahcr((ahcz)apyw.a);
            }
            case 3: {
                return new apyw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyw.a, "\u0001\u0000", null);
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
