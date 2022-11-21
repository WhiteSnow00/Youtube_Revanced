import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agvb extends ahcz implements aheo
{
    public static final agvb a;
    private static volatile ahev c;
    public long b;
    
    static {
        ahcz.registerDefaultInstance(agvb.class, a = new agvb());
    }
    
    private agvb() {
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
                if ((c = agvb.c) == null) {
                    synchronized (agvb.class) {
                        if (agvb.c == null) {
                            agvb.c = (ahev)new ahcs((ahcz)agvb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agvb.a;
            }
            case 4: {
                return new ahcr((ahcz)agvb.a);
            }
            case 3: {
                return new agvb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agvb.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[] { "b" });
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
