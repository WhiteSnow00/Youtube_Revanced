import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjy extends ahcz implements aheo
{
    public static final apjy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apjy.class, a = new apjy());
    }
    
    private apjy() {
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
                if ((b = apjy.b) == null) {
                    synchronized (apjy.class) {
                        if (apjy.b == null) {
                            apjy.b = (ahev)new ahcs((ahcz)apjy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjy.a;
            }
            case 4: {
                return new ahcr((ahcz)apjy.a);
            }
            case 3: {
                return new apjy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjy.a, "\u0001\u0000", null);
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
