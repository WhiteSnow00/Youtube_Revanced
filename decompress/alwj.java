import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwj extends ahcz implements aheo
{
    public static final alwj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alwj.class, a = new alwj());
    }
    
    private alwj() {
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
                if ((b = alwj.b) == null) {
                    synchronized (alwj.class) {
                        if (alwj.b == null) {
                            alwj.b = (ahev)new ahcs((ahcz)alwj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwj.a;
            }
            case 4: {
                return new ahcr((ahcz)alwj.a);
            }
            case 3: {
                return new alwj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwj.a, "\u0001\u0000", null);
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
