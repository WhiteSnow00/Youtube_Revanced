import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrf extends ahcz implements aheo
{
    public static final agrf a;
    private static volatile ahev c;
    public String b;
    
    static {
        ahcz.registerDefaultInstance(agrf.class, a = new agrf());
    }
    
    private agrf() {
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
                if ((c = agrf.c) == null) {
                    synchronized (agrf.class) {
                        if (agrf.c == null) {
                            agrf.c = (ahev)new ahcs((ahcz)agrf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrf.a;
            }
            case 4: {
                return new ahcr((ahcz)agrf.a);
            }
            case 3: {
                return new agrf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrf.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
