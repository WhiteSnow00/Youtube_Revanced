import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxn extends ahcz implements aheo
{
    public static final apxn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxn.class, a = new apxn());
    }
    
    private apxn() {
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
                if ((b = apxn.b) == null) {
                    synchronized (apxn.class) {
                        if (apxn.b == null) {
                            apxn.b = (ahev)new ahcs((ahcz)apxn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxn.a;
            }
            case 4: {
                return new ahcr((ahcz)apxn.a);
            }
            case 3: {
                return new apxn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxn.a, "\u0001\u0000", null);
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
