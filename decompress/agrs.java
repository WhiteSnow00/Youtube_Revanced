import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrs extends ahcz implements aheo
{
    public static final agrs a;
    private static volatile ahev c;
    public String b;
    
    static {
        ahcz.registerDefaultInstance(agrs.class, a = new agrs());
    }
    
    private agrs() {
        this.b = "";
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
                if ((c = agrs.c) == null) {
                    synchronized (agrs.class) {
                        if (agrs.c == null) {
                            agrs.c = (ahev)new ahcs((ahcz)agrs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrs.a;
            }
            case 4: {
                return new ahcr((ahcz)agrs.a);
            }
            case 3: {
                return new agrs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrs.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
