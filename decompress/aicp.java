import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicp extends ahcz implements aheo
{
    public static final aicp a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aicp.class, a = new aicp());
    }
    
    private aicp() {
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
                if ((c = aicp.c) == null) {
                    synchronized (aicp.class) {
                        if (aicp.c == null) {
                            aicp.c = (ahev)new ahcs((ahcz)aicp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aicp.a;
            }
            case 4: {
                return new ahcr((ahcz)aicp.a);
            }
            case 3: {
                return new aicp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
