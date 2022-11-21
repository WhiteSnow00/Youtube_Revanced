import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvs extends ahcz implements aheo
{
    public static final apvs a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvs.class, a = new apvs());
    }
    
    private apvs() {
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
                if ((b = apvs.b) == null) {
                    synchronized (apvs.class) {
                        if (apvs.b == null) {
                            apvs.b = (ahev)new ahcs((ahcz)apvs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvs.a;
            }
            case 4: {
                return new ahcr((ahcz)apvs.a);
            }
            case 3: {
                return new apvs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvs.a, "\u0001\u0000", null);
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
