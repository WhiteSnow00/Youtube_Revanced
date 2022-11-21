import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbx extends ahcz implements aheo
{
    public static final arbx a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(arbx.class, a = new arbx());
    }
    
    private arbx() {
        this.c = "";
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
                if ((d = arbx.d) == null) {
                    synchronized (arbx.class) {
                        if (arbx.d == null) {
                            arbx.d = (ahev)new ahcs((ahcz)arbx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbx.a;
            }
            case 4: {
                return new ahcr((ahcz)arbx.a);
            }
            case 3: {
                return new arbx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
