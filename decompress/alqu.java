import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqu extends ahcz implements aheo
{
    public static final alqu a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqu.class, a = new alqu());
    }
    
    private alqu() {
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
                if ((b = alqu.b) == null) {
                    synchronized (alqu.class) {
                        if (alqu.b == null) {
                            alqu.b = (ahev)new ahcs((ahcz)alqu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqu.a;
            }
            case 4: {
                return new ahcr((ahcz)alqu.a);
            }
            case 3: {
                return new alqu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqu.a, "\u0001\u0000", null);
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
