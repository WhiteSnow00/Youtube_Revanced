import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alny extends ahcz implements aheo
{
    public static final alny a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alny.class, a = new alny());
    }
    
    private alny() {
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
                if ((b = alny.b) == null) {
                    synchronized (alny.class) {
                        if (alny.b == null) {
                            alny.b = (ahev)new ahcs((ahcz)alny.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alny.a;
            }
            case 4: {
                return new ahcr((ahcz)alny.a);
            }
            case 3: {
                return new alny();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alny.a, "\u0001\u0000", null);
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
