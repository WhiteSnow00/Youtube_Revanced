import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxz extends ahcz implements aheo
{
    public static final apxz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxz.class, a = new apxz());
    }
    
    private apxz() {
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
                if ((b = apxz.b) == null) {
                    synchronized (apxz.class) {
                        if (apxz.b == null) {
                            apxz.b = (ahev)new ahcs((ahcz)apxz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxz.a;
            }
            case 4: {
                return new ahcr((ahcz)apxz.a);
            }
            case 3: {
                return new apxz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxz.a, "\u0001\u0000", null);
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
