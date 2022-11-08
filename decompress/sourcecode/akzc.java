import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzc extends agzi implements ahax
{
    public static final akzc a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public boolean d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)akzc.class, (agzi)(a = new akzc()));
    }
    
    private akzc() {
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = akzc.e) == null) {
                    synchronized (akzc.class) {
                        if (akzc.e == null) {
                            akzc.e = (ahbe)new agzb((agzi)akzc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akzc.a;
            }
            case 4: {
                return new agza((agzi)akzc.a);
            }
            case 3: {
                return new akzc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzc.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u100b\u0002\u0004\u1007\u0003", new Object[] { "f", "b", "c", "d" });
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
