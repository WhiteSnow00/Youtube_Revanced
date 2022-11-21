import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqo extends ahcz implements aheo
{
    public static final alqo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqo.class, a = new alqo());
    }
    
    private alqo() {
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
                if ((b = alqo.b) == null) {
                    synchronized (alqo.class) {
                        if (alqo.b == null) {
                            alqo.b = (ahev)new ahcs((ahcz)alqo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqo.a;
            }
            case 4: {
                return new ahcr((ahcz)alqo.a);
            }
            case 3: {
                return new alqo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqo.a, "\u0001\u0000", null);
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
