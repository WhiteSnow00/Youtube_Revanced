import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqab extends ahcz implements aheo
{
    public static final aqab a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqab.class, a = new aqab());
    }
    
    private aqab() {
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
                if ((b = aqab.b) == null) {
                    synchronized (aqab.class) {
                        if (aqab.b == null) {
                            aqab.b = (ahev)new ahcs((ahcz)aqab.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqab.a;
            }
            case 4: {
                return new ahcr((ahcz)aqab.a);
            }
            case 3: {
                return new aqab();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqab.a, "\u0001\u0000", null);
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
