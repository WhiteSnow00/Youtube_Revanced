import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcs extends ahcz implements aheo
{
    public static final akcs a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akcs.class, a = new akcs());
    }
    
    private akcs() {
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
                if ((b = akcs.b) == null) {
                    synchronized (akcs.class) {
                        if (akcs.b == null) {
                            akcs.b = (ahev)new ahcs((ahcz)akcs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcs.a;
            }
            case 4: {
                return new ahcr((ahcz)akcs.a);
            }
            case 3: {
                return new akcs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcs.a, "\u0001\u0000", null);
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
