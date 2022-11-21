import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyr extends ahcz implements aheo
{
    public static final alyr a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alyr.class, a = new alyr());
    }
    
    private alyr() {
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
                if ((b = alyr.b) == null) {
                    synchronized (alyr.class) {
                        if (alyr.b == null) {
                            alyr.b = (ahev)new ahcs((ahcz)alyr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alyr.a;
            }
            case 4: {
                return new ahcr((ahcz)alyr.a);
            }
            case 3: {
                return new alyr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyr.a, "\u0001\u0000", null);
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
