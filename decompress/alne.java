import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alne extends ahcz implements aheo
{
    public static final alne a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alne.class, a = new alne());
    }
    
    private alne() {
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
                if ((b = alne.b) == null) {
                    synchronized (alne.class) {
                        if (alne.b == null) {
                            alne.b = (ahev)new ahcs((ahcz)alne.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alne.a;
            }
            case 4: {
                return new ahcr((ahcz)alne.a);
            }
            case 3: {
                return new alne();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alne.a, "\u0001\u0000", null);
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
