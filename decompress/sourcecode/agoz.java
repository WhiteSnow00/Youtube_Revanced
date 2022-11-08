import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoz extends agzi implements ahax
{
    public static final agoz a;
    private static volatile ahbe c;
    public agpc b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(agoz.class, a = new agoz());
    }
    
    private agoz() {
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
                if ((c = agoz.c) == null) {
                    synchronized (agoz.class) {
                        if (agoz.c == null) {
                            agoz.c = (ahbe)new agzb((agzi)agoz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agoz.a;
            }
            case 4: {
                return new agza((agzi)agoz.a);
            }
            case 3: {
                return new agoz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
