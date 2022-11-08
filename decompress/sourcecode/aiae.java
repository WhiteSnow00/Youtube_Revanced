import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiae extends agzi implements ahax
{
    public static final aiae a;
    private static volatile ahbe f;
    public aiad b;
    public aiad c;
    public aiad d;
    public aiad e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(aiae.class, a = new aiae());
    }
    
    private aiae() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aiae.f) == null) {
                    synchronized (aiae.class) {
                        if (aiae.f == null) {
                            aiae.f = (ahbe)new agzb((agzi)aiae.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiae.a;
            }
            case 4: {
                return new agza((agzi)aiae.a);
            }
            case 3: {
                return new aiae();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiae.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
