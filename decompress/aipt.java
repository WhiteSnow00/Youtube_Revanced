import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipt extends ahcz implements aheo
{
    public static final aipt a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipt.class, a = new aipt());
    }
    
    private aipt() {
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
                if ((b = aipt.b) == null) {
                    synchronized (aipt.class) {
                        if (aipt.b == null) {
                            aipt.b = (ahev)new ahcs((ahcz)aipt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipt.a;
            }
            case 4: {
                return new ahcr((ahcz)aipt.a);
            }
            case 3: {
                return new aipt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipt.a, "\u0001\u0000", null);
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
