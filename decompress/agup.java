import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agup extends ahcz implements aheo
{
    public static final agup a;
    private static volatile ahev f;
    public int b;
    public int c;
    public long d;
    public aguj e;
    
    static {
        ahcz.registerDefaultInstance(agup.class, a = new agup());
    }
    
    private agup() {
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
                if ((f = agup.f) == null) {
                    synchronized (agup.class) {
                        if (agup.f == null) {
                            agup.f = (ahev)new ahcs((ahcz)agup.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agup.a;
            }
            case 4: {
                return new ahcr((ahcz)agup.a);
            }
            case 3: {
                return new agup();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agup.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1009\u0002", new Object[] { "b", "c", aqym.b, "d", "e" });
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
