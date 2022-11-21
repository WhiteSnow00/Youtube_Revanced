import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agro extends ahcz implements aheo
{
    public static final agro a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(agro.class, a = new agro());
    }
    
    private agro() {
        this.b = ahcz.emptyProtobufList();
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
                if ((c = agro.c) == null) {
                    synchronized (agro.class) {
                        if (agro.c == null) {
                            agro.c = (ahev)new ahcs((ahcz)agro.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agro.a;
            }
            case 4: {
                return new ahcr((ahcz)agro.a);
            }
            case 3: {
                return new agro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agro.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agrp.class });
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
