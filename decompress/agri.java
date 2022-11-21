import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agri extends ahcz implements aheo
{
    public static final agri a;
    private static volatile ahev f;
    public agsa b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(agri.class, a = new agri());
    }
    
    private agri() {
        this.c = "";
        this.d = "";
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
                final ahev f;
                if ((f = agri.f) == null) {
                    synchronized (agri.class) {
                        if (agri.f == null) {
                            agri.f = (ahev)new ahcs((ahcz)agri.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agri.a;
            }
            case 4: {
                return new ahcr((ahcz)agri.a);
            }
            case 3: {
                return new agri();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agri.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0004\u0208\u0005\u0208", new Object[] { "b", "c", "d", "e" });
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
