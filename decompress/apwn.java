import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwn extends ahcz implements aheo
{
    public static final apwn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwn.class, a = new apwn());
    }
    
    private apwn() {
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
                if ((b = apwn.b) == null) {
                    synchronized (apwn.class) {
                        if (apwn.b == null) {
                            apwn.b = (ahev)new ahcs((ahcz)apwn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwn.a;
            }
            case 4: {
                return new ahcr((ahcz)apwn.a);
            }
            case 3: {
                return new apwn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwn.a, "\u0001\u0000", null);
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
