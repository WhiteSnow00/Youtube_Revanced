import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidk extends ahcz implements aheo
{
    public static final aidk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aidk.class, a = new aidk());
    }
    
    private aidk() {
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
                if ((b = aidk.b) == null) {
                    synchronized (aidk.class) {
                        if (aidk.b == null) {
                            aidk.b = (ahev)new ahcs((ahcz)aidk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidk.a;
            }
            case 4: {
                return new ahcr((ahcz)aidk.a);
            }
            case 3: {
                return new aidk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidk.a, "\u0001\u0000", null);
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
