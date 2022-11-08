import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpi extends agzi implements ahax
{
    public static final agpi a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(agpi.class, a = new agpi());
    }
    
    private agpi() {
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agpi.d) == null) {
                    synchronized (agpi.class) {
                        if (agpi.d == null) {
                            agpi.d = (ahbe)new agzb((agzi)agpi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agpi.a;
            }
            case 4: {
                return new agza((agzi)agpi.a);
            }
            case 3: {
                return new agpi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
