import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agru extends ahcz implements aheo
{
    public static final agru a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agru.class, a = new agru());
    }
    
    private agru() {
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
                if ((b = agru.b) == null) {
                    synchronized (agru.class) {
                        if (agru.b == null) {
                            agru.b = (ahev)new ahcs((ahcz)agru.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agru.a;
            }
            case 4: {
                return new ahcr((ahcz)agru.a);
            }
            case 3: {
                return new agru();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agru.a, "\u0000\u0000", null);
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
