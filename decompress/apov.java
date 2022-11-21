import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apov extends ahcz implements aheo
{
    public static final apov a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apov.class, a = new apov());
    }
    
    private apov() {
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
                if ((b = apov.b) == null) {
                    synchronized (apov.class) {
                        if (apov.b == null) {
                            apov.b = (ahev)new ahcs((ahcz)apov.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apov.a;
            }
            case 4: {
                return new ahcr((ahcz)apov.a);
            }
            case 3: {
                return new apov();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apov.a, "\u0001\u0000", null);
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
