import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqx extends agzi implements ahax
{
    public static final jqx a;
    private static volatile ahbe d;
    public int b;
    public jqw c;
    
    static {
        agzi.registerDefaultInstance(jqx.class, a = new jqx());
    }
    
    private jqx() {
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
                if ((d = jqx.d) == null) {
                    synchronized (jqx.class) {
                        if (jqx.d == null) {
                            jqx.d = (ahbe)new agzb((agzi)jqx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jqx.a;
            }
            case 4: {
                return new agza((agzi)jqx.a);
            }
            case 3: {
                return new jqx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jqx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
