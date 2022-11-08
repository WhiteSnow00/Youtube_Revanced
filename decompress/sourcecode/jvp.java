import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvp extends agzi implements ahax
{
    public static final jvp a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(jvp.class, a = new jvp());
    }
    
    private jvp() {
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
                if ((d = jvp.d) == null) {
                    synchronized (jvp.class) {
                        if (jvp.d == null) {
                            jvp.d = (ahbe)new agzb((agzi)jvp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jvp.a;
            }
            case 4: {
                return new agza((agzi)jvp.a);
            }
            case 3: {
                return new jvp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jvp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
