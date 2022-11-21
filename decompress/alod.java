import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alod extends ahcz implements aheo
{
    private static final alod a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alod.class, a = new alod());
    }
    
    private alod() {
    }
    
    public static alod a() {
        return alod.a;
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
                if ((b = alod.b) == null) {
                    synchronized (alod.class) {
                        if (alod.b == null) {
                            alod.b = (ahev)new ahcs((ahcz)alod.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alod.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new alod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alod.a, "\u0001\u0000", null);
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
