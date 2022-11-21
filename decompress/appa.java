import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appa extends ahcz implements aheo
{
    public static final appa a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(appa.class, a = new appa());
    }
    
    private appa() {
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
                if ((b = appa.b) == null) {
                    synchronized (appa.class) {
                        if (appa.b == null) {
                            appa.b = (ahev)new ahcs((ahcz)appa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appa.a;
            }
            case 4: {
                return new ahcr((ahcz)appa.a);
            }
            case 3: {
                return new appa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appa.a, "\u0001\u0000", null);
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
