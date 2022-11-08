import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amff extends agzi implements ahax
{
    public static final amff a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)amff.class, (agzi)(a = new amff()));
    }
    
    private amff() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amff.d) == null) {
                    synchronized (amff.class) {
                        if (amff.d == null) {
                            amff.d = (ahbe)new agzb((agzi)amff.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amff.a;
            }
            case 4: {
                return new agza((agzi)amff.a);
            }
            case 3: {
                return new amff();
            }
            case 2: {
                return newMessageInfo((MessageLite)amff.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", amcq.m });
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
