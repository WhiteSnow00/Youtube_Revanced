import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvu extends ahcz implements aheo
{
    public static final apvu a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvu.class, a = new apvu());
    }
    
    private apvu() {
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
                if ((b = apvu.b) == null) {
                    synchronized (apvu.class) {
                        if (apvu.b == null) {
                            apvu.b = (ahev)new ahcs((ahcz)apvu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvu.a;
            }
            case 4: {
                return new ahcr((ahcz)apvu.a);
            }
            case 3: {
                return new apvu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvu.a, "\u0001\u0000", null);
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
