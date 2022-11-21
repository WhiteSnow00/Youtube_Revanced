import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwp extends ahcz implements aheo
{
    public static final apwp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwp.class, a = new apwp());
    }
    
    private apwp() {
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
                if ((b = apwp.b) == null) {
                    synchronized (apwp.class) {
                        if (apwp.b == null) {
                            apwp.b = (ahev)new ahcs((ahcz)apwp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwp.a;
            }
            case 4: {
                return new ahcr((ahcz)apwp.a);
            }
            case 3: {
                return new apwp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwp.a, "\u0001\u0000", null);
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
