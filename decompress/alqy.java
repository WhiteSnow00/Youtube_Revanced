import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqy extends ahcz implements aheo
{
    private static final alqy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqy.class, a = new alqy());
    }
    
    private alqy() {
    }
    
    public static alqy a() {
        return alqy.a;
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
                if ((b = alqy.b) == null) {
                    synchronized (alqy.class) {
                        if (alqy.b == null) {
                            alqy.b = (ahev)new ahcs((ahcz)alqy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqy.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new alqy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqy.a, "\u0001\u0000", null);
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
