import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agut extends ahcz implements aheo
{
    public static final agut a;
    private static volatile ahev f;
    public int b;
    public int c;
    public String d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(agut.class, a = new agut());
    }
    
    private agut() {
        this.d = "";
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
                if ((f = agut.f) == null) {
                    synchronized (agut.class) {
                        if (agut.f == null) {
                            agut.f = (ahev)new ahcs((ahcz)agut.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agut.a;
            }
            case 4: {
                return new ahcr((ahcz)agut.a);
            }
            case 3: {
                return new agut();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agut.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u100c\u0002", new Object[] { "b", "c", aqnr.t, "d", "e", aqnr.u });
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
