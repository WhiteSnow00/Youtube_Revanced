import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agri extends agzi implements ahax
{
    public static final agri a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agri.class, a = new agri());
    }
    
    private agri() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agri.c) == null) {
                    synchronized (agri.class) {
                        if (agri.c == null) {
                            agri.c = (ahbe)new agzb((agzi)agri.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agri.a;
            }
            case 4: {
                return new agza((agzi)agri.a);
            }
            case 3: {
                return new agri();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agri.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
