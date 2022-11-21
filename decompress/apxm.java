import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxm extends ahcz implements aheo
{
    public static final apxm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxm.class, a = new apxm());
    }
    
    private apxm() {
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
                if ((b = apxm.b) == null) {
                    synchronized (apxm.class) {
                        if (apxm.b == null) {
                            apxm.b = (ahev)new ahcs((ahcz)apxm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxm.a;
            }
            case 4: {
                return new ahcr((ahcz)apxm.a);
            }
            case 3: {
                return new apxm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxm.a, "\u0001\u0000", null);
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
