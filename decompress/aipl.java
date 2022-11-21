import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipl extends ahcz implements aheo
{
    public static final aipl a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipl.class, a = new aipl());
    }
    
    private aipl() {
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
                if ((b = aipl.b) == null) {
                    synchronized (aipl.class) {
                        if (aipl.b == null) {
                            aipl.b = (ahev)new ahcs((ahcz)aipl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipl.a;
            }
            case 4: {
                return new ahcr((ahcz)aipl.a);
            }
            case 3: {
                return new aipl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipl.a, "\u0001\u0000", null);
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
