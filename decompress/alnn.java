import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnn extends ahcz implements aheo
{
    public static final alnn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnn.class, a = new alnn());
    }
    
    private alnn() {
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
                if ((b = alnn.b) == null) {
                    synchronized (alnn.class) {
                        if (alnn.b == null) {
                            alnn.b = (ahev)new ahcs((ahcz)alnn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnn.a;
            }
            case 4: {
                return new ahcr((ahcz)alnn.a);
            }
            case 3: {
                return new alnn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnn.a, "\u0001\u0000", null);
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
