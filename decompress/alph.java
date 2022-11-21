import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alph extends ahcz implements aheo
{
    public static final alph a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alph.class, a = new alph());
    }
    
    private alph() {
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
                if ((b = alph.b) == null) {
                    synchronized (alph.class) {
                        if (alph.b == null) {
                            alph.b = (ahev)new ahcs((ahcz)alph.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alph.a;
            }
            case 4: {
                return new ahcr((ahcz)alph.a);
            }
            case 3: {
                return new alph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alph.a, "\u0001\u0000", null);
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
