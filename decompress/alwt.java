import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwt extends ahcz implements aheo
{
    public static final alwt a;
    private static volatile ahev g;
    public int b;
    public apxc c;
    public apxb d;
    public ajby e;
    public anwx f;
    
    static {
        ahcz.registerDefaultInstance(alwt.class, a = new alwt());
    }
    
    private alwt() {
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
                if ((g = alwt.g) == null) {
                    synchronized (alwt.class) {
                        if (alwt.g == null) {
                            alwt.g = (ahev)new ahcs((ahcz)alwt.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alwt.a;
            }
            case 4: {
                return new ahcr((ahcz)alwt.a);
            }
            case 3: {
                return new alwt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwt.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
