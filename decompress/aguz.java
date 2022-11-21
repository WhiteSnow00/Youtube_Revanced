import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguz extends ahcz implements aheo
{
    public static final aguz a;
    private static volatile ahev c;
    public int b;
    
    static {
        ahcz.registerDefaultInstance(aguz.class, a = new aguz());
    }
    
    private aguz() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aguz.c) == null) {
                    synchronized (aguz.class) {
                        if (aguz.c == null) {
                            aguz.c = (ahev)new ahcs((ahcz)aguz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aguz.a;
            }
            case 4: {
                return new ahcr((ahcz)aguz.a);
            }
            case 3: {
                return new aguz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguz.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
