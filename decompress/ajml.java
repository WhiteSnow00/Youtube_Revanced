import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajml extends ahcz implements aheo
{
    public static final ajml a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajml.class, a = new ajml());
    }
    
    private ajml() {
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
                if ((b = ajml.b) == null) {
                    synchronized (ajml.class) {
                        if (ajml.b == null) {
                            ajml.b = (ahev)new ahcs((ahcz)ajml.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajml.a;
            }
            case 4: {
                return new ahcr((ahcz)ajml.a);
            }
            case 3: {
                return new ajml();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajml.a, "\u0001\u0000", null);
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
