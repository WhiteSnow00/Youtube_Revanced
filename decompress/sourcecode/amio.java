import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amio extends agzi implements ahax
{
    public static final amio a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)amio.class, (agzi)(a = new amio()));
    }
    
    private amio() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amio.c) == null) {
                    synchronized (amio.class) {
                        if (amio.c == null) {
                            amio.c = (ahbe)new agzb((agzi)amio.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amio.a;
            }
            case 4: {
                return new agza((agzi)amio.a);
            }
            case 3: {
                return new amio();
            }
            case 2: {
                return newMessageInfo((MessageLite)amio.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amcq.t });
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
