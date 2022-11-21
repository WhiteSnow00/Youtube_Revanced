import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agum extends ahcz implements aheo
{
    public static final agum a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(agum.class, a = new agum());
    }
    
    private agum() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = agum.e) == null) {
                    synchronized (agum.class) {
                        if (agum.e == null) {
                            agum.e = (ahev)new ahcs((ahcz)agum.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agum.a;
            }
            case 4: {
                return new ahcr((ahcz)agum.a);
            }
            case 3: {
                return new agum();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agum.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aqnr.s, "d", aqnr.r });
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
