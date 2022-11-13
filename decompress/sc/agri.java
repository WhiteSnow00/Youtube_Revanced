import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agri extends ahbh implements ahcw
{
    public static final agri a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)agri.class, (ahbh)(a = new agri()));
    }
    
    private agri() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agri.c) == null) {
                    synchronized (agri.class) {
                        if (agri.c == null) {
                            agri.c = (ahdd)new ahba((ahbh)agri.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agri.a;
            }
            case 4: {
                return new ahaz((ahbh)agri.a);
            }
            case 3: {
                return new agri();
            }
            case 2: {
                return newMessageInfo((MessageLite)agri.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
