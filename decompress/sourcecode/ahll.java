import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahll extends agzi implements ahax
{
    public static final ahll a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahll.class, (agzi)(a = new ahll()));
    }
    
    private ahll() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahll.c) == null) {
                    synchronized (ahll.class) {
                        if (ahll.c == null) {
                            ahll.c = (ahbe)new agzb((agzi)ahll.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahll.a;
            }
            case 4: {
                return new agza((agzi)ahll.a);
            }
            case 3: {
                return new ahll();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahll.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
