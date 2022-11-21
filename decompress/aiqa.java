import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqa extends ahcz implements aheo
{
    public static final aiqa a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aiqa.class, a = new aiqa());
    }
    
    private aiqa() {
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
                if ((b = aiqa.b) == null) {
                    synchronized (aiqa.class) {
                        if (aiqa.b == null) {
                            aiqa.b = (ahev)new ahcs((ahcz)aiqa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiqa.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqa.a);
            }
            case 3: {
                return new aiqa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqa.a, "\u0001\u0000", null);
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
