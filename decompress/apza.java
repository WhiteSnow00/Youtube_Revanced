import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apza extends ahcz implements aheo
{
    public static final apza a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apza.class, a = new apza());
    }
    
    private apza() {
        final ahbt b = ahbt.b;
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
                if ((b = apza.b) == null) {
                    synchronized (apza.class) {
                        if (apza.b == null) {
                            apza.b = (ahev)new ahcs((ahcz)apza.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apza.a;
            }
            case 4: {
                return new ahcr((ahcz)apza.a);
            }
            case 3: {
                return new apza();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apza.a, "\u0001\u0000", null);
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
