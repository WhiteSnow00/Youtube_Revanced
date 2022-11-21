import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almu extends ahcz implements aheo
{
    public static final almu a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(almu.class, a = new almu());
    }
    
    private almu() {
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
                if ((b = almu.b) == null) {
                    synchronized (almu.class) {
                        if (almu.b == null) {
                            almu.b = (ahev)new ahcs((ahcz)almu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almu.a;
            }
            case 4: {
                return new ahcr((ahcz)almu.a);
            }
            case 3: {
                return new almu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almu.a, "\u0001\u0000", null);
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
