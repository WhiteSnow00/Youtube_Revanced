import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguy extends ahcz implements aheo
{
    public static final aguy a;
    private static volatile ahev c;
    public ahbg b;
    
    static {
        ahcz.registerDefaultInstance(aguy.class, a = new aguy());
    }
    
    private aguy() {
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
                if ((c = aguy.c) == null) {
                    synchronized (aguy.class) {
                        if (aguy.c == null) {
                            aguy.c = (ahev)new ahcs((ahcz)aguy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aguy.a;
            }
            case 4: {
                return new ahcr((ahcz)aguy.a);
            }
            case 3: {
                return new aguy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguy.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
