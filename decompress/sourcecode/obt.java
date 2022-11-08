import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obt extends agzi implements ahax
{
    public static final obt a;
    private static volatile ahbe e;
    public agsd b;
    public int c;
    public obb d;
    
    static {
        agzi.registerDefaultInstance((Class)obt.class, (agzi)(a = new obt()));
    }
    
    private obt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = obt.e) == null) {
                    synchronized (obt.class) {
                        if (obt.e == null) {
                            obt.e = (ahbe)new agzb((agzi)obt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obt.a;
            }
            case 4: {
                return new agza((agzi)obt.a);
            }
            case 3: {
                return new obt();
            }
            case 2: {
                return newMessageInfo((MessageLite)obt.a, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\t\u0003\f\u0004\t", new Object[] { "b", "c", "d" });
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
