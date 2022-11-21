import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjt extends ahcz implements aheo
{
    public static final apjt a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apjt.class, a = new apjt());
    }
    
    private apjt() {
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
                if ((b = apjt.b) == null) {
                    synchronized (apjt.class) {
                        if (apjt.b == null) {
                            apjt.b = (ahev)new ahcs((ahcz)apjt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjt.a;
            }
            case 4: {
                return new ahcr((ahcz)apjt.a);
            }
            case 3: {
                return new apjt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjt.a, "\u0001\u0000", null);
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
