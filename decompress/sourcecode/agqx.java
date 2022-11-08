import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqx extends agzi implements ahax
{
    public static final agqx a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agqx.class, a = new agqx());
    }
    
    private agqx() {
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
                if ((d = agqx.d) == null) {
                    synchronized (agqx.class) {
                        if (agqx.d == null) {
                            agqx.d = (ahbe)new agzb((agzi)agqx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqx.a;
            }
            case 4: {
                return new agza((agzi)agqx.a);
            }
            case 3: {
                return new agqx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqkf.t });
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
