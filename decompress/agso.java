import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agso extends ahcz implements aheo
{
    public static final agso a;
    private static volatile ahev c;
    public agsg b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(agso.class, a = new agso());
    }
    
    private agso() {
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
                if ((c = agso.c) == null) {
                    synchronized (agso.class) {
                        if (agso.c == null) {
                            agso.c = (ahev)new ahcs((ahcz)agso.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agso.a;
            }
            case 4: {
                return new ahcr((ahcz)agso.a);
            }
            case 3: {
                return new agso();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agso.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
