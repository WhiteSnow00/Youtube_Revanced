import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmy extends ahcz implements aheo
{
    public static final ajmy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmy.class, a = new ajmy());
    }
    
    private ajmy() {
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
                if ((b = ajmy.b) == null) {
                    synchronized (ajmy.class) {
                        if (ajmy.b == null) {
                            ajmy.b = (ahev)new ahcs((ahcz)ajmy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmy.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmy.a);
            }
            case 3: {
                return new ajmy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmy.a, "\u0001\u0000", null);
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
