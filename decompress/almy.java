import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almy extends ahcz implements aheo
{
    private static final almy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(almy.class, a = new almy());
    }
    
    private almy() {
    }
    
    public static almy a() {
        return almy.a;
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
                if ((b = almy.b) == null) {
                    synchronized (almy.class) {
                        if (almy.b == null) {
                            almy.b = (ahev)new ahcs((ahcz)almy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almy.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new almy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almy.a, "\u0001\u0000", null);
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
