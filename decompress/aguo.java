import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguo extends ahcz implements aheo
{
    public static final aguo a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aguo.class, a = new aguo());
    }
    
    private aguo() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aguo.d) == null) {
                    synchronized (aguo.class) {
                        if (aguo.d == null) {
                            aguo.d = (ahev)new ahcs((ahcz)aguo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aguo.a;
            }
            case 4: {
                return new ahcr((ahcz)aguo.a);
            }
            case 3: {
                return new aguo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqym.b });
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
