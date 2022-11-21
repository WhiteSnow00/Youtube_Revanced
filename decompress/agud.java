import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agud extends ahcz implements aheo
{
    public static final agud a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agud.class, a = new agud());
    }
    
    private agud() {
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
                if ((b = agud.b) == null) {
                    synchronized (agud.class) {
                        if (agud.b == null) {
                            agud.b = (ahev)new ahcs((ahcz)agud.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agud.a;
            }
            case 4: {
                return new ahcr((ahcz)agud.a);
            }
            case 3: {
                return new agud();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agud.a, "\u0001\u0000", null);
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
