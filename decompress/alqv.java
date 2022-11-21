import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqv extends ahcz implements aheo
{
    public static final alqv a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqv.class, a = new alqv());
    }
    
    private alqv() {
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
                if ((b = alqv.b) == null) {
                    synchronized (alqv.class) {
                        if (alqv.b == null) {
                            alqv.b = (ahev)new ahcs((ahcz)alqv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqv.a;
            }
            case 4: {
                return new ahcr((ahcz)alqv.a);
            }
            case 3: {
                return new alqv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqv.a, "\u0001\u0000", null);
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
