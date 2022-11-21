import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agus extends ahcz implements aheo
{
    public static final agus a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(agus.class, a = new agus());
    }
    
    private agus() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = agus.f) == null) {
                    synchronized (agus.class) {
                        if (agus.f == null) {
                            agus.f = (ahev)new ahcs((ahcz)agus.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agus.a;
            }
            case 4: {
                return new ahcr((ahcz)agus.a);
            }
            case 3: {
                return new agus();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agus.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", aqyp.a(), "d", aqyq.a(), "e", aqyo.a() });
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
