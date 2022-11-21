import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrd extends ahcz implements aheo
{
    public static final aqrd a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqrd.class, a = new aqrd());
    }
    
    private aqrd() {
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
                if ((b = aqrd.b) == null) {
                    synchronized (aqrd.class) {
                        if (aqrd.b == null) {
                            aqrd.b = (ahev)new ahcs((ahcz)aqrd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrd.a);
            }
            case 3: {
                return new aqrd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrd.a, "\u0001\u0000", null);
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
