import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alno extends ahcz implements aheo
{
    public static final alno a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alno.class, a = new alno());
    }
    
    private alno() {
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
                if ((b = alno.b) == null) {
                    synchronized (alno.class) {
                        if (alno.b == null) {
                            alno.b = (ahev)new ahcs((ahcz)alno.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alno.a;
            }
            case 4: {
                return new ahcr((ahcz)alno.a);
            }
            case 3: {
                return new alno();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alno.a, "\u0001\u0000", null);
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
