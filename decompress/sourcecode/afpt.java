import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpt extends agzi implements ahax
{
    public static final afpt a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(afpt.class, a = new afpt());
    }
    
    private afpt() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = afpt.g) == null) {
                    synchronized (afpt.class) {
                        if (afpt.g == null) {
                            afpt.g = (ahbe)new agzb((agzi)afpt.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return afpt.a;
            }
            case 4: {
                return new agza((agzi)afpt.a);
            }
            case 3: {
                return new afpt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpt.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003", new Object[] { "b", "c", aeih.r, "d", "e", "f" });
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
