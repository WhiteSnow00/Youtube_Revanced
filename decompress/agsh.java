import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsh extends ahcz implements aheo
{
    public static final agsh a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(agsh.class, a = new agsh());
    }
    
    private agsh() {
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = agsh.g) == null) {
                    synchronized (agsh.class) {
                        if (agsh.g == null) {
                            agsh.g = (ahev)new ahcs((ahcz)agsh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agsh.a;
            }
            case 4: {
                return new ahcr((ahcz)agsh.a);
            }
            case 3: {
                return new agsh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsh.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "b", "c", afsd.f, "d", afsd.e, "e", "f", aqnr.t });
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
