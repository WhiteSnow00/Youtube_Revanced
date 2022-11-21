import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqt extends ahcz implements aheo
{
    public static final alqt a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqt.class, a = new alqt());
    }
    
    private alqt() {
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
                if ((b = alqt.b) == null) {
                    synchronized (alqt.class) {
                        if (alqt.b == null) {
                            alqt.b = (ahev)new ahcs((ahcz)alqt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqt.a;
            }
            case 4: {
                return new ahcr((ahcz)alqt.a);
            }
            case 3: {
                return new alqt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqt.a, "\u0001\u0000", null);
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
