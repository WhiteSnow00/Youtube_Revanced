import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqr extends ahcz implements aheo
{
    public static final alqr a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqr.class, a = new alqr());
    }
    
    private alqr() {
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
                if ((b = alqr.b) == null) {
                    synchronized (alqr.class) {
                        if (alqr.b == null) {
                            alqr.b = (ahev)new ahcs((ahcz)alqr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqr.a;
            }
            case 4: {
                return new ahcr((ahcz)alqr.a);
            }
            case 3: {
                return new alqr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqr.a, "\u0001\u0000", null);
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
