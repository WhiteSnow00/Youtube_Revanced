import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwc extends ahcz implements aheo
{
    public static final apwc a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwc.class, a = new apwc());
    }
    
    private apwc() {
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
                if ((b = apwc.b) == null) {
                    synchronized (apwc.class) {
                        if (apwc.b == null) {
                            apwc.b = (ahev)new ahcs((ahcz)apwc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwc.a;
            }
            case 4: {
                return new ahcr((ahcz)apwc.a);
            }
            case 3: {
                return new apwc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwc.a, "\u0001\u0000", null);
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
