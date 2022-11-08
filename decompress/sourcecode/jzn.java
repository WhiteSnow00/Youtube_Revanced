import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzn extends agzi implements ahax
{
    public static final jzn a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance((Class)jzn.class, (agzi)(a = new jzn()));
    }
    
    private jzn() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = jzn.d) == null) {
                    synchronized (jzn.class) {
                        if (jzn.d == null) {
                            jzn.d = (ahbe)new agzb((agzi)jzn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jzn.a;
            }
            case 4: {
                return new agza((agzi)jzn.a);
            }
            case 3: {
                return new jzn();
            }
            case 2: {
                return newMessageInfo((MessageLite)jzn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
