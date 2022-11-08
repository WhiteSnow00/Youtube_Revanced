import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlu extends agzi implements ahax
{
    public static final jlu a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)jlu.class, (agzi)(a = new jlu()));
    }
    
    private jlu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = jlu.d) == null) {
                    synchronized (jlu.class) {
                        if (jlu.d == null) {
                            jlu.d = (ahbe)new agzb((agzi)jlu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jlu.a;
            }
            case 4: {
                return new agza((agzi)jlu.a);
            }
            case 3: {
                return new jlu();
            }
            case 2: {
                return newMessageInfo((MessageLite)jlu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
