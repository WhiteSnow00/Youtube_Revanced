import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apre extends ahcz implements aheo
{
    public static final apre a;
    private static volatile ahev g;
    public int b;
    public aprd c;
    public apnm d;
    public ajoc e;
    public aogz f;
    
    static {
        ahcz.registerDefaultInstance(apre.class, a = new apre());
    }
    
    private apre() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apre.g) == null) {
                    synchronized (apre.class) {
                        if (apre.g == null) {
                            apre.g = (ahev)new ahcs((ahcz)apre.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apre.a;
            }
            case 4: {
                return new ahcr((ahcz)apre.a);
            }
            case 3: {
                return new apre();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apre.a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004\u1009\u0000\u0005\u1009\u0001\u0006\u1009\u0002\u0007\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
