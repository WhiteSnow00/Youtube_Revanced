import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipm extends ahcz implements aheo
{
    public static final aipm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aipm.class, a = new aipm());
    }
    
    private aipm() {
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
                if ((b = aipm.b) == null) {
                    synchronized (aipm.class) {
                        if (aipm.b == null) {
                            aipm.b = (ahev)new ahcs((ahcz)aipm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aipm.a;
            }
            case 4: {
                return new ahcr((ahcz)aipm.a);
            }
            case 3: {
                return new aipm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipm.a, "\u0001\u0000", null);
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
