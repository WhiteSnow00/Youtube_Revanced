import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwa extends ahcz implements aheo
{
    public static final apwa a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwa.class, a = new apwa());
    }
    
    private apwa() {
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
                if ((b = apwa.b) == null) {
                    synchronized (apwa.class) {
                        if (apwa.b == null) {
                            apwa.b = (ahev)new ahcs((ahcz)apwa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwa.a;
            }
            case 4: {
                return new ahcr((ahcz)apwa.a);
            }
            case 3: {
                return new apwa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwa.a, "\u0001\u0000", null);
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
