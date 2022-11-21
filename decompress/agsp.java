import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsp extends ahcz implements aheo
{
    public static final agsp a;
    private static volatile ahev h;
    public int b;
    public int c;
    public Object d;
    public agsi e;
    public String f;
    public agss g;
    
    static {
        ahcz.registerDefaultInstance(agsp.class, a = new agsp());
    }
    
    private agsp() {
        this.c = 0;
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = agsp.h) == null) {
                    synchronized (agsp.class) {
                        if (agsp.h == null) {
                            agsp.h = (ahev)new ahcs((ahcz)agsp.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agsp.a;
            }
            case 4: {
                return new ahcr((ahcz)agsp.a);
            }
            case 3: {
                return new agsp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsp.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u1009\u0004", new Object[] { "d", "c", "b", "e", "f", "g" });
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
